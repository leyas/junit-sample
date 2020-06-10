package pl.szymonleyk.junit;

import java.util.Arrays;

public final class Calculator {

	public static int add(int ...numbers) {
		return Arrays.stream(numbers).reduce(0, (a, b)->a+b);
	}
	
	public static double random() {
		return Math.random();
	}
}
