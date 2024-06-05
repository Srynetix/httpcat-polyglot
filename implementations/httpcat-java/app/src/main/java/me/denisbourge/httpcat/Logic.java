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

public class Logic {

	public final String HTTP_CAT_ROOT_URL = "https://http.cat";
	public final String HTTP_DOG_ROOT_URL = "https://http.dog";

	public URI getPetCodeImageUrl(PetType petType, int statusCode) {
		try {
			if (petType == PetType.Cat) {
				return new URI(String.format("%s/images/%d.jpg", HTTP_CAT_ROOT_URL, statusCode));
			}
			return new URI(String.format("%s/%d.jpg", HTTP_DOG_ROOT_URL, statusCode));
		}
		catch (URISyntaxException e) {
			e.printStackTrace();
			System.exit(1);
		}

		return null;
	}

	public byte[] fetchPetCodeImage(PetType petType, int statusCode) {
		HttpRequest request = HttpRequest.newBuilder().uri(this.getPetCodeImageUrl(petType, statusCode)).GET().build();
		HttpClient client = HttpClient.newHttpClient();

		try {
			HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
			return response.body();
		}
		catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			System.exit(1);
		}

		return null;
	}

	public String convertImageToAscii(byte[] imageData, int width, int height) {
		InputStream inputStream = new ByteArrayInputStream(imageData);
		BufferedImage bufferedImage;

		try {
			bufferedImage = ImageIO.read(inputStream);
		}
		catch (IOException e) {
			e.printStackTrace();
			return new String();
		}

		BetterImage image = new BetterImage(bufferedImage);
		ParserConfig config = ParserBuilder.startBuild()
			.scaled()
			.width(width)
			.height(height)
			.getScale()
			.colorAlgorithm(new AnsiColorAlgorithm())
			.reversed(true)
			.build();

		return AsciiParser.parse(image, config);
	}

	public boolean isStatusCodeValid(int statusCode) {
		// Really not great, but a more adapted solution is yet to find.
		return statusCode >= 100 && statusCode < 600;
	}

}
