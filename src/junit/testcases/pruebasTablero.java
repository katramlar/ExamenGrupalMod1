package junit.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebasTablero {

	@Test
	void test() {
		int num = (int)(Math.random() * ((2 - 0) + 1)) + 0;
		System.out.println(num);
	}

}
