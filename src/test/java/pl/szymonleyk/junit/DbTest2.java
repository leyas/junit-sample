package pl.szymonleyk.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DbTest2 {

	@BeforeAll
	static void before() {
		Db.add("Marian");
		Db.add("Jurek");
		Db.add("Stefan");
		Db.add("Karol");
		Db.add("Kazik");
	}
	
	@Test
	void exists() {
		assertTrue(Db.exists("Karol"));
	}
	
	@Test
	void notExists() {
		assertFalse(Db.exists("Zosia"));
	}
	
	
	@AfterAll
	static void after() {
		Db.delete("Marian");
		Db.delete("Jurek");
		Db.delete("Stefan");
		Db.delete("Karol");
		Db.delete("Kazik");
	}
	
}
