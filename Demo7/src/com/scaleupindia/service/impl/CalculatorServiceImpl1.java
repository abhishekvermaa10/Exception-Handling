package com.scaleupindia.service.impl;

import java.io.IOException;

import com.scaleupindia.service.CalculatorService;
import com.scaleupindia.utility.CustomResource;
import com.scaleupindia.utility.CustomResource2;

/**
 * @author abhishekvermaa10
 *
 */
public class CalculatorServiceImpl1 implements CalculatorService {
	@Override
	public void divide(Integer... array) throws IOException {
		int quotient = 0;
		CustomResource customResource = new CustomResource();
		CustomResource2 customResource2 = new CustomResource2();
		try (customResource; customResource2) {
			if (array[1] == 0) {
				throw new IOException("Cannot divide by " + array[1]);
			}
			customResource.process();
			customResource2.process();
			quotient = array[0] / array[1];
			System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
		} catch (Exception exception) {
			System.out.println(exception);
			throw exception;
		}
	}
}
