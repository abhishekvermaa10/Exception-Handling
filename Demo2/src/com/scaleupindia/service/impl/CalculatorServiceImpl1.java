package com.scaleupindia.service.impl;

import com.scaleupindia.service.CalculatorService;

/**
 * @author abhishekvermaa10
 *
 */
public class CalculatorServiceImpl1 implements CalculatorService {
	@Override
	public void divide(Integer... array) {
		int quotient = 0;
		try {
			quotient = array[0] / array[2];
			System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
		} catch (ArithmeticException exception) {
			System.out.println("Cannot divide by " + array[1]);
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Index out of bound");
		} catch (Exception exception) {
			System.out.println("Something went wrong");
		}
	}
}
