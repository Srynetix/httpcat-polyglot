namespace HttpCat;

using SixLabors.ImageSharp;
using SixLabors.ImageSharp.Formats.Jpeg;
using SixLabors.ImageSharp.Formats.Png;
using TextImage;
using TextImage.Enums;

public class Logic {
    public const string HTTP_CAT_ROOT_URL = "https://http.cat";
    public const string HTTP_DOG_ROOT_URL = "https://http.dog";

    static readonly HttpClient client = new();

    public static string GetPetCodeImageUrl(PetType petType, int statusCode) {
        if (petType == PetType.Cat) {
            return $"{HTTP_CAT_ROOT_URL}/images/{statusCode}.jpg";
        }
        return $"{HTTP_DOG_ROOT_URL}/{statusCode}.jpg";
    }

    public static async Task<byte[]> FetchPetCodeImage(PetType petType, int statusCode) {
        using HttpResponseMessage response = await client.GetAsync(GetPetCodeImageUrl(petType, statusCode));
        response.EnsureSuccessStatusCode();
        return await response.Content.ReadAsByteArrayAsync();
    }

    public static string ConvertImageToAscii(byte[] imageData, int width) {
        Console.WriteLine("Before");
        var image = Image.Load(imageData);

        MemoryStream ms = new MemoryStream();
        image.Save(ms, PngFormat.Instance);
        var imageByte = ms.ToArray();
        ms.Dispose();

        MemoryStream ms2 = new MemoryStream(imageByte);
		System.Drawing.Image returnImage = System.Drawing.Image.FromStream(ms2);
        ms2.Dispose();

        return new ImageTextBuilder()
            .WithSource(new System.Drawing.Bitmap(returnImage))
            .WithFormat(ImageTextFormat.Ascii)
            .Build();
    }

    public static bool IsStatusCodeValid(int statusCode) {
        return true;
    }
}