package org.nt67.junitprac.prac1802;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator cal;

	@Before
	public void instantiateCalculator(){
		cal = new Calculator();
	}

	@Test(expected = IllegalArgumentException.class)
	public void divisor_is_zero() {
		cal.divide(1, 0);
	}

	@Test
	public void divide_is_omit_decimal_places(){
		assertThat(cal.divide(3, 2), is(1));
	}
}
