import 'package:httpcat_dart/logic.dart';
import 'package:test/test.dart';

void main() {
  test('getPetCodeImageUrl', () {
    expect(getPetCodeImageUrl(PetType.cat, 200),
        Uri.parse("https://http.cat/images/200.jpg"));
    expect(getPetCodeImageUrl(PetType.dog, 200),
        Uri.parse("https://http.dog/200.jpg"));
  });

  test('isStatusCodeValid', () {
    expect(isStatusCodeValid(200), true);
    expect(isStatusCodeValid(1), false);
  });
}
