import asciify from "asciify-image";
import { getReasonPhrase } from "http-status-codes";

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
	if (petType === PetType.Cat) {
		return `${HTTP_CAT_ROOT_URL}/images/${statusCode}.jpg`;
	}

	return `${HTTP_DOG_ROOT_URL}/${statusCode}.jpg`;
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
	const data = await asciify(Buffer.from(imageData), {
		color: true,
		fit: "width",
		width,
	});

	// Replace ";" with a dot '.' to "improve" rendering.
	return (data as string).replace(/;/g, ".");
}

export function isStatusCodeValid(statusCode: number): boolean {
	// Not pretty, I know.
	try {
		getReasonPhrase(statusCode);
		return true;
	} catch (_e) {
		return false;
	}
}
