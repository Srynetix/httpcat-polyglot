import 'dart:io';

import 'package:args/args.dart';
import 'package:httpcat_dart/logic.dart';

void showHelp() {
  print("usage: httpcat-dart HTTP_STATUS_CODE [--dog] [--width WIDTH]");
  print("");
  print("Options:");
  print("  --dog          Use if you prefer dogs");
  print("  --width WIDTH  Image width");
}

void runCmd(List<String> arguments) async {
  final parser = ArgParser();
  parser.addFlag("help", abbr: 'h', help: "Show usage help", defaultsTo: false);
  parser.addFlag("dog",
      help: "Use if you prefer dogs", negatable: false, defaultsTo: false);
  parser.addOption("width", help: "Image width", defaultsTo: "125");

  final results = parser.parse(arguments);
  if (results.rest.isEmpty || results.rest.length > 1 || results.flag("help")) {
    showHelp();
    exit(1);
  }

  final statusCode = int.tryParse(results.rest.first);
  if (statusCode == null) {
    print("ERROR: status code is not a number: ${results.rest.first}\n");
    showHelp();
    exit(1);
  }

  if (!isStatusCodeValid(statusCode)) {
    print("ERROR: status code is not valid: $statusCode\n");
    showHelp();
    exit(1);
  }

  final width = int.tryParse(results.option("width")!);
  if (width == null) {
    print("ERROR: width is not a number: ${results.option("width")}\n");
    showHelp();
    exit(1);
  }

  var petType = PetType.cat;
  if (results.flag("dog")) {
    petType = PetType.dog;
  }

  final imageData = await fetchPetCodeImage(petType, statusCode);
  print(convertImageToAscii(imageData, width));
}
