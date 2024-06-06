package me.denisbourge.httpcat

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertEquals

import java.net.URI

class LogicTest {
    @Test fun getPetCodeImageUrl() {
		var logic = Logic();
		assertEquals(logic.getPetCodeImageUrl(PetType.Cat, 200), URI("https://http.cat/images/200.jpg"));
		assertEquals(logic.getPetCodeImageUrl(PetType.Dog, 200), URI("https://http.dog/200.jpg"));
    }
}
