package com.scaleupindia.service.impl;

import com.scaleupindia.service.CalculatorService;

/**
 * @author abhishekvermaa10
 *
 */
public class CalculatorServiceImpl implements CalculatorService {
	@Override
	public void divide(Integer... array) {
		int quotient = 0;
		if(array[1] == 0) {
			throw new NullPointerException();
		}
		quotient = array[0] / array[1];
		System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
	}
}
