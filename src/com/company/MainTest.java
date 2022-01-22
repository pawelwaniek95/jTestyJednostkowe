package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author night
 * @since 02.03.2021
 */
class MainTest {

	@Test
	public void calculate_deltazero_oneResullt() {

		// given
		double a = 2;
		double b = 4;
		double c = 2;
		Calculator calculator = new Calculator();

		// when
		Double[] result = calculator.calculate(a, b, c);
		Double[] expected = {Double.valueOf(0), Double.valueOf(-1), Double.valueOf(-1)};

		//then
		Assertions.assertArrayEquals(expected,result);
	}

	@Test
	public void calculate_deltaLessZero_noResults() {

		// given
		double a = 2;
		double b = 1;
		double c = 1;
		Calculator calculator = new Calculator();

		// when
		Double[] result = calculator.calculate(a, b, c);
		Double[] expected = {Double.valueOf(-1), Double.valueOf(-3), Double.valueOf(-1)};

		//then
		Assertions.assertArrayEquals(expected,result);
	}

	@Test
	public void calculate_deltaMoreZero_twoResult() {

		// given
		double a = 2;
		double b = 8;
		double c = 6;
		Calculator calculator = new Calculator();

		// when
		Double[] result = calculator.calculate(a, b, c);
		Double[] expected = {Double.valueOf(0), Double.valueOf(-1), Double.valueOf(-3)};

		//then
		Assertions.assertArrayEquals(expected,result);
	}

	@Test
	public void calculate_aEqual0_conflictingEquation() {

		// given
		double a = 0;
		double b = 1;
		double c = 1;
		Calculator calculator = new Calculator();

		// when
		Double[] result = calculator.calculate(a, b, c);
		Double[] expected = {Double.valueOf(-1), Double.valueOf(-2), Double.valueOf(-1)};

		//then
		Assertions.assertArrayEquals(expected,result);
	}

	@Test
	public void calculate_aEqual0bEqual0_idencticalEquation() {

		// given
		double a = 0;
		double b = 0;
		double c = 1;
		Calculator calculator = new Calculator();

		// when
		Double[] result = calculator.calculate(a, b, c);
		Double[] expected = {Double.valueOf(-1), Double.valueOf(-1), Double.valueOf(-1)};

		//then
		Assertions.assertArrayEquals(expected,result);
	}

}