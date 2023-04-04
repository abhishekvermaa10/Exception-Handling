package com.scaleupindia.service.impl;

import java.io.IOException;

import com.scaleupindia.service.CalculatorService;
import com.scaleupindia.utility.CustomResource;

/**
 * @author abhishekvermaa10
 *
 */
public class CalculatorServiceImpl3 implements CalculatorService {
	@Override
	public void divide(Integer... array) throws IOException {
		int quotient = 0;
		CustomResource customResource = new CustomResource();
		customResource.start();
		try {
			if (array[1] == 0) {
				throw new IOException("Cannot divide by " + array[1]);
			}
			customResource.process();
			quotient = array[0] / array[1];
			System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
		} catch (Exception exception) {
			System.out.println(exception);
			throw exception;
		} finally {
			customResource.close();
		}
	}
}
