package pl.szymonleyk.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import static pl.szymonleyk.junit.Calculator.add;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
	void addTest() {
		assertNotEquals(2, add(33, 2));
	}
}
