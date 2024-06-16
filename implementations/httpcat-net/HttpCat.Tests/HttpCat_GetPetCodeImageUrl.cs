namespace HttpCat.Tests;

public class HttpCat_GetPetCodeImageUrl {
    [Fact]
    public void GetPetCodeImageUrl_Cat() {
        Assert.Equal("https://http.cat/images/200.jpg", Logic.GetPetCodeImageUrl(PetType.Cat, 200));
    }

    [Fact]
    public void GetPetCodeImageUrl_Dog() {
        Assert.Equal("https://http.dog/200.jpg", Logic.GetPetCodeImageUrl(PetType.Dog, 200));
    }
}