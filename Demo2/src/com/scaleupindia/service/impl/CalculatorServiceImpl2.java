package com.scaleupindia.service.impl;

import com.scaleupindia.service.CalculatorService;

/**
 * @author abhishekvermaa10
 *
 */
public class CalculatorServiceImpl2 implements CalculatorService {
	@Override
	public void divide(Integer... array) {
		int quotient = 0;
		try {
			quotient = array[0] / array[2];
			System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		} catch (Exception exception) {
			System.out.println("Something went wrong");
		}
	}
}
