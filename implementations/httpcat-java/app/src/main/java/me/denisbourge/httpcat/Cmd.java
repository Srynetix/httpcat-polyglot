package me.denisbourge.httpcat;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "httpcat-java", version = "1.0.0", mixinStandardHelpOptions = true)
public class Cmd implements Runnable {

	@Option(names = { "--dog" }, description = "Use if you prefer dogs.")
	private boolean dog = false;

	@Option(names = { "--width" }, description = "Image width.")
	private int width = 125;

	@Option(names = { "--height" }, description = "Image height.")
	private int height = 75;

	@Parameters(paramLabel = "<HTTP status code>", type = int.class, description = "HTTP status code.")
	private int statusCode;

	@Override
	public void run() {
		Logic logic = new Logic();
		PetType petType = PetType.Cat;
		if (this.dog) {
			petType = PetType.Dog;
		}

		if (!logic.isStatusCodeValid(this.statusCode)) {
			System.err.println(String.format("ERROR: invalid status code: %d", this.statusCode));
			System.exit(1);
		}

		byte[] imageData = logic.fetchPetCodeImage(petType, this.statusCode);
		System.out.println(logic.convertImageToAscii(imageData, this.width, this.height));
	}

	public static void runCmd(String... args) {
		int exitCode = new CommandLine(new Cmd()).execute(args);
		System.exit(exitCode);
	}
}
