package com.scaleupindia;

import com.scaleupindia.service.CalculatorService;
import com.scaleupindia.service.impl.CalculatorServiceImpl;
import com.scaleupindia.service.impl.CalculatorServiceImpl1;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		try {
			calculatorService.divide(10, 2);

			calculatorService.divide(10, 0);
		} catch (Exception exception) {
			System.out.println("Something went wrong");
		}
	}
}
