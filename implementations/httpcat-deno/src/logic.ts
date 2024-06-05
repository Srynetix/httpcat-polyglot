import { getImageStrings } from "https://deno.land/x/terminal_images@3.1.0/mod.ts";
import { getReasonPhrase } from "npm:http-status-codes";

export enum PetType {
  Cat = "cat",
  Dog = "dog",
}

const HTTP_CAT_ROOT_URL = "https://http.cat";
const HTTP_DOG_ROOT_URL = "https://http.dog";

export function getPetCodeImageUrl(
  petType: PetType,
  statusCode: number,
): string {
  if (petType == PetType.Cat) {
    return `${HTTP_CAT_ROOT_URL}/images/${statusCode}.jpg`;
  } else {
    return `${HTTP_DOG_ROOT_URL}/${statusCode}.jpg`;
  }
}

export async function fetchPetCodeImage(
  petType: PetType,
  statusCode: number,
): Promise<ArrayBuffer> {
  const responseData = await fetch(getPetCodeImageUrl(petType, statusCode));
  return responseData.arrayBuffer();
}

export async function convertImageToAscii(
  imageData: ArrayBuffer,
  width: number,
): Promise<string> {
  return (await getImageStrings({
    rawFile: new Uint8Array(imageData),
    color: true,
    // From https://paulbourke.net/dataformats/asciiart/
    characterMap:
      "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\|()1{}[]?-_+~<>i!lI;:,\"^`'. ",
    inverted: true,
    width,
  })).join("\n");
}

export function isStatusCodeValid(statusCode: number): boolean {
  try {
    getReasonPhrase(statusCode);
    return true;
  } catch (_e) {
    return false;
  }
}
