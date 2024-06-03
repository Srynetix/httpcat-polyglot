import { PetType, getPetCodeImageUrl, isStatusCodeValid } from "../src/logic";

test("getPetCodeImageUrl", () => {
	expect(getPetCodeImageUrl(PetType.Cat, 200)).toEqual(
		"https://http.cat/images/200.jpg",
	);
	expect(getPetCodeImageUrl(PetType.Dog, 200)).toEqual(
		"https://http.dog/200.jpg",
	);
});

test("isStatusCodeValid", () => {
	expect(isStatusCodeValid(200)).toBe(true);
	expect(isStatusCodeValid(1)).toBe(false);
});
