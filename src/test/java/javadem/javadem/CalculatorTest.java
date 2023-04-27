package javadem.javadem;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc=new Calculator();
		int result=calc.add(50, 50);
		assertEquals(100, result);
		
	}

	@Test
	public void test2() {
		Calculator calc=new Calculator();
		int result=calc.add(-150, 50);
		assertEquals(-100,result );
		
	}
	
	
	
}
