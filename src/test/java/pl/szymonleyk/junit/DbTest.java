package pl.szymonleyk.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(OrderAnnotation.class)
public class DbTest {

	@Order(2)
	@ParameterizedTest(name = "{0} został dodany")
	@ValueSource(strings = {"Marian", "Stefan", "Jurek"})
	void addTest(String imie) {
		Db.add(imie);
		assertTrue(Db.exists(imie));
	}
	
	@Order(3)
	@ParameterizedTest(name = "{0} został dodany")
	@CsvSource("Stefan")
	void deleteTest(String imie) {
		Db.delete(imie);
		assertFalse(Db.exists(imie));
	}
	
	@Order(1)
	@Test
	void notExistsTest() {
		assertFalse(Db.exists("Stefan"));
	}
	

	@Order(4)
	@Test
	void existsTest() {
		assertTrue(Db.exists("Marian"));
	}
}
