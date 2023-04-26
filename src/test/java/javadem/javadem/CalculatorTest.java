package javadem.javadem;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc=new Calculator();
		assertEquals(100, calc.add(50, 50));
		
	}

	@Test
	public void test2() {
		Calculator calc=new Calculator();
		assertEquals(-100, calc.add(-150, 50));
		
	}
	
	
	
}
