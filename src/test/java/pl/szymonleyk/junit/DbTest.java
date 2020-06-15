package pl.szymonleyk.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DbTest {

	@ParameterizedTest(name = "{0} został dodany")
	@CsvSource("Marian, Stefan, Jurek")
	void addTest(String imie) {
		Db.add(imie);
		assertTrue(Db.exists(imie));
	}
	
	@ParameterizedTest(name = "{0} został dodany")
	@CsvSource("Stefan")
	void deleteTest(String imie) {
		Db.delete(imie);
		assertFalse(Db.exists(imie));
	}
	
	@Test
	void notExistsTest() {
		assertFalse(Db.exists("Karol"));
	}
}
