package pl.szymonleyk.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OsobaTest {

	@Test
	void przedstawTest1() {
		Osoba osoba = new Osoba("Marian", "Kowalski");
		assertEquals("Cześć Marian.", osoba.przywitaj());
	}
	
	@Test
	void przedstawTest2() {
		Osoba osoba = new Osoba("Karol", "Kowalski");
		assertEquals("Cześć Karol.", osoba.przywitaj());
	}
	
	@Test
	void przedstawTest3() {
		Osoba osoba = new Osoba(null, "Kowalski");
		assertThrows(NullPointerException.class,  () -> osoba.przywitaj());
	}
}
