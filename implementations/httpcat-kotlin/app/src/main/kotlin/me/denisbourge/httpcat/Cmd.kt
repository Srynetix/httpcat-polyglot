package me.denisbourge.httpcat

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters
import kotlin.system.exitProcess

@Command(name = "httpcat-kotlin", version = ["1.0.0"], mixinStandardHelpOptions = true)
class Cmd: Runnable {
    @Option(names = [ "--dog" ], description = ["Use if you prefer dogs."])
	private var dog: Boolean = false;

	@Option(names = [ "--width" ], description = ["Image width."])
	private var width: Int = 125;

	@Option(names = [ "--height" ], description = ["Image height."])
	private var height: Int = 75;

	@Parameters(paramLabel = "<HTTP status code>", description = ["HTTP status code."])
	private var statusCode: Int = -1;

    override fun run() {
		var logic = Logic();
		var petType = PetType.Cat;
		if (this.dog) {
			petType = PetType.Dog;
		}

		if (!logic.isStatusCodeValid(this.statusCode)) {
			println("ERROR: invalid status code: ${this.statusCode}");
			exitProcess(1);
		}

		var imageData = logic.fetchPetCodeImage(petType, this.statusCode);
		println(logic.convertImageToAscii(imageData, this.width, this.height));
    }
}

fun runCmd(args: Array<String>) {
	var exitCode = CommandLine(Cmd()).execute(*args);
	exitProcess(exitCode);
}