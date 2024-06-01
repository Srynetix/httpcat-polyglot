import asyncio
from typing import Annotated

import typer

from .logic import PetType, fetchPetCodeImage, imageDataToAscii, isStatusCodeValid


async def async_cmd_main(*, status_code: int, dog: bool, width: int):
    pet_type = PetType.Cat
    if dog:
        pet_type = PetType.Dog

    data = await fetchPetCodeImage(pet_type, status_code)
    print(imageDataToAscii(data, width))


def cmd_main(
    status_code: Annotated[int, typer.Argument(help="HTTP status code")],
    dog: Annotated[bool, typer.Argument(help="use if you prefer dogs")] = False,
    width: Annotated[int, typer.Argument(help="image width")] = 120,
):
    if not isStatusCodeValid(status_code):
        print(f"Invalid status code: {status_code}")
        raise typer.Exit(1)

    asyncio.run(async_cmd_main(status_code=status_code, dog=dog, width=width))
