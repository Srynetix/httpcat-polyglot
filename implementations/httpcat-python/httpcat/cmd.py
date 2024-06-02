import asyncio
from typing import Annotated

import typer

from .logic import (
    PetType,
    fetch_pet_code_image_as_bytes,
    convert_image_data_to_ascii,
    is_status_code_valid,
)


async def async_cmd_main(*, status_code: int, dog: bool, width: int):
    pet_type = PetType.Cat
    if dog:
        pet_type = PetType.Dog

    data = await fetch_pet_code_image_as_bytes(pet_type, status_code)
    print(convert_image_data_to_ascii(data, width))


def cmd_main(
    status_code: Annotated[int, typer.Argument(help="HTTP status code")],
    dog: Annotated[bool, typer.Option(help="use if you prefer dogs")] = False,
    width: Annotated[int, typer.Option(help="image width")] = 100,
):
    if not is_status_code_valid(status_code):
        print(f"Invalid status code: {status_code}")
        raise typer.Exit(1)

    asyncio.run(async_cmd_main(status_code=status_code, dog=dog, width=width))
