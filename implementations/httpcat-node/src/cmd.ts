import yargs from "yargs";
import { hideBin } from "yargs/helpers";

import { fetchPetCodeImage, PetType } from "./logic";
import { convertImageToAscii } from "./logic";
import { isStatusCodeValid } from "./logic";

export async function runCmd() {
	const args = await yargs(hideBin(process.argv))
		.scriptName("httpcat-node")
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
			default: 75,
		})
		.demandCommand(1)
		.parse();

	let petType = PetType.Cat;
	if (args.dog) {
		petType = PetType.Dog;
	}

	const statusCode = Number.parseInt(args._[0] as string);
	if (!isStatusCodeValid(statusCode)) {
		console.error(`Invalid status code: ${statusCode}`);
		process.exit(1);
	}

	const imageData = await fetchPetCodeImage(petType, statusCode);
	console.log(await convertImageToAscii(imageData, args.width));
}
