package me.denisbourge.httpcat;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.imageio.ImageIO;

import io.github.seujorgenochurras.image.BetterImage;
import io.github.seujorgenochurras.image.ascii.AsciiParser;
import io.github.seujorgenochurras.image.ascii.ParserBuilder;
import io.github.seujorgenochurras.image.ascii.ParserConfig;
import io.github.seujorgenochurras.image.ascii.algorithm.pixel.color.AnsiColorAlgorithm;
import kotlin.system.exitProcess

class Logic {
    val HTTP_CAT_ROOT_URL: String = "https://http.cat";
    val HTTP_DOG_ROOT_URL: String = "https://http.dog";

	fun getPetCodeImageUrl(petType: PetType, statusCode: Int): URI {
        if (petType == PetType.Cat) {
            return URI("${HTTP_CAT_ROOT_URL}/images/${statusCode}.jpg");
        }
        return URI("${HTTP_DOG_ROOT_URL}/${statusCode}.jpg");
	}

	fun fetchPetCodeImage(petType: PetType, statusCode: Int): ByteArray {
		var request = HttpRequest.newBuilder().uri(this.getPetCodeImageUrl(petType, statusCode)).GET().build();
		var client = HttpClient.newHttpClient();

		try {
			var response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
			return response.body();
		}
		catch (e: IOException) {
			e.printStackTrace();
			exitProcess(1);
		}
		catch (e: InterruptedException) {
			e.printStackTrace();
			exitProcess(1);
		}
	}

	fun convertImageToAscii(imageData: ByteArray, width: Int, height: Int): String {
		var inputStream = ByteArrayInputStream(imageData);
		var bufferedImage: BufferedImage;

		try {
			bufferedImage = ImageIO.read(inputStream);
		}
		catch (e: IOException) {
			e.printStackTrace();
			return String();
		}

		var image = BetterImage(bufferedImage);
		var config = ParserBuilder.startBuild()
			.scaled()
			.width(width)
			.height(height)
			.getScale()
			.colorAlgorithm(AnsiColorAlgorithm())
			.reversed(true)
			.build();

		return AsciiParser.parse(image, config);
	}

	fun isStatusCodeValid(statusCode: Int): Boolean {
		// Really not great, but a more adapted solution is yet to find.
		return statusCode >= 100 && statusCode < 600;
	}
}
