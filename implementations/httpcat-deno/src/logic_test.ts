import { assert, assertEquals } from "@std/assert";

import { getPetCodeImageUrl, PetType } from "./logic.ts";
import { isStatusCodeValid } from "./logic.ts";

Deno.test("getPetCodeImageUrl", () => {
  assertEquals(
    getPetCodeImageUrl(PetType.Cat, 200),
    "https://http.cat/images/200.jpg",
  );
  assertEquals(
    getPetCodeImageUrl(PetType.Dog, 200),
    "https://http.dog/200.jpg",
  );
});

Deno.test("isStatusCodeValid", () => {
  assert(isStatusCodeValid(200));
  assert(!isStatusCodeValid(1));
  assert(!isStatusCodeValid(318));
});
