import yargs from "https://deno.land/x/yargs@v17.7.2-deno/deno.ts";

import { fetchPetCodeImage, PetType } from "./logic.ts";
import { convertImageToAscii } from "./logic.ts";
import { isStatusCodeValid } from "./logic.ts";

export async function runCmd() {
  const args = yargs(Deno.args)
    .usage("Usage: $0 status_code [--dog] [--width image_width]")
    .positional("status_code", {
      describe: "HTTP status code",
    })
    .option("dog", {
      type: "boolean",
      describe: "Use if you prefer dogs",
    })
    .option("width", {
      type: "number",
      describe: "Image width",
      default: 100,
    })
    .demandCommand(1)
    .parse();

  let petType = PetType.Cat;
  if (args.dog) {
    petType = PetType.Dog;
  }

  const statusCode = args._[0];
  if (!isStatusCodeValid(statusCode)) {
    console.error(`Invalid status code: ${statusCode}`);
    Deno.exit(1);
  }

  const imageData = await fetchPetCodeImage(petType, args._[0]);
  console.log(await convertImageToAscii(imageData, args.width));
}
