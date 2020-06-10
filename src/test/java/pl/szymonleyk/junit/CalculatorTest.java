package pl.szymonleyk.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.szymonleyk.junit.Calculator.add;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	@Test
	void addOneToOne() {
		assertEquals(2, add(1, 1));
	}
	
	@Test
	void addThreeToTwo() {
		assertEquals(5, add(3, 2));
	}
	
	@Test
	@DisplayName("0+2 = 2")
	void addZeroToTwo() {
		assertEquals(2, add(0, 2));
	}
	
	@Test
	@DisplayName("33+2 != 2")
	void addTest33Plus2() {
		assertNotEquals(2, add(33, 2));
	}
	
	@ParameterizedTest(name = "{0}+{1}={2}")
	@CsvSource({"1, 0, 1", "23,32,55", "0,22,22"})
	void addEqualsTest(int first, int second, int expected) {
		assertEquals(expected, add(first, second));
	}
	
	@RepeatedTest(value = 5)
	void randomTest() {
		assertTrue(Calculator.random() > 0);
	}
	
	@RepeatedTest(5)
	void randomTest2() {
		assertNotNull(Calculator.random());
	}
}
