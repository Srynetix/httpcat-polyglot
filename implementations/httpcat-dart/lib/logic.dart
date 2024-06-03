import 'dart:typed_data';

import 'package:http/http.dart' as http;
import 'package:enough_ascii_art/enough_ascii_art.dart' as art;
import 'package:image/image.dart' as image;
import 'package:http_status_code/http_status_code.dart' as hsc;

enum PetType { cat, dog }

const httpCatRootUrl = "https://http.cat";
const httpDogRootUrl = "https://http.dog";

bool isStatusCodeValid(int statusCode) {
  return hsc.getStatusMessage(statusCode) != "Unknown Status Code";
}

Uri getPetCodeImageUrl(PetType petType, int statusCode) {
  if (petType == PetType.cat) {
    return Uri.parse("$httpCatRootUrl/images/$statusCode.jpg");
  }
  return Uri.parse("$httpDogRootUrl/$statusCode.jpg");
}

Future<Uint8List> fetchPetCodeImage(PetType petType, int statusCode) async {
  final data = await http.get(getPetCodeImageUrl(petType, statusCode));
  return data.bodyBytes;
}

String convertImageToAscii(Uint8List imageData, int width) {
  final img = image.decodeImage(imageData)!;
  var ascii = art.convertImage(img, maxWidth: width, invert: true);
  return ascii;
}
