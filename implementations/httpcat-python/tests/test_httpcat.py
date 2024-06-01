from httpcat.logic import get_pet_code_image_url, is_status_code_valid, PetType


def test_get_pet_code_image_url():
    assert get_pet_code_image_url(PetType.Cat, 200) == "https://http.cat/images/200.jpg"
    assert get_pet_code_image_url(PetType.Dog, 200) == "https://http.dog/200.jpg"


def test_is_status_code_valid():
    assert is_status_code_valid(100)
    assert not is_status_code_valid(1)
