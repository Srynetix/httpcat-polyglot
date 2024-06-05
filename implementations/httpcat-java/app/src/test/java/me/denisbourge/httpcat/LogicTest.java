/*
 * This source file was generated by the Gradle 'init' task
 */
package me.denisbourge.httpcat;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

	@Test
	void getPetCodeImageUrl() throws URISyntaxException {
		Logic logic = new Logic();
		assertEquals(logic.getPetCodeImageUrl(PetType.Cat, 200), new URI("https://http.cat/images/200.jpg"));
		assertEquals(logic.getPetCodeImageUrl(PetType.Dog, 200), new URI("https://http.dog/200.jpg"));
	}

}