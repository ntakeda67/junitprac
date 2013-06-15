package org.nt67.junitprac.prac1802;

public class Calculator {

	/**
	 *
	 * @param dividend
	 * @param divisor
	 * @exception IllegalArgumentException when divisor is 0.
	 * @return quotient which {@code dividend} divide {@code divisor} as integer.
	 */
	public int divide(int dividend, int divisor){
		if(divisor ==0){
			throw new IllegalArgumentException("prohibit 0 dividor.");
		}
		return dividend % divisor;
	}
}
