import enum
from io import BytesIO

from ascii_magic import AsciiArt
import httpx
from PIL import Image


class PetType(enum.StrEnum):
    Cat = "cat"
    Dog = "dog"


HTTP_CAT_ROOT_URL = "https://http.cat"
HTTP_DOG_ROOT_URL = "https://http.dog"


def get_pet_code_image_url(pet_type: PetType, status_code: int) -> str:
    if pet_type == PetType.Cat:
        return f"{HTTP_CAT_ROOT_URL}/images/{status_code}.jpg"
    else:
        return f"{HTTP_DOG_ROOT_URL}/{status_code}.jpg"


async def fetch_pet_code_image_as_bytes(pet_type: PetType, status_code: int) -> bytes:
    async with httpx.AsyncClient() as client:
        response = await client.get(get_pet_code_image_url(pet_type, status_code))
        return response.read()


def convert_image_data_to_ascii(image: bytes, width: int) -> str:
    img = Image.open(BytesIO(image))
    art = AsciiArt.from_pillow_image(img)
    return art.to_ascii(columns=width)


def is_status_code_valid(code: int) -> bool:
    return code in list(httpx.codes)
