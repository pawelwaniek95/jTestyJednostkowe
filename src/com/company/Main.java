package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
	public static void main(String[] args) {
		double a, b, c;
		Scanner klaw = new Scanner(System.in);
		System.out.print("a=");
		a = klaw.nextFloat();
		System.out.print("b=");
		b = klaw.nextFloat();
		System.out.print("c=");
		c = klaw.nextFloat();
		Calculator calculator = new Calculator();
		Double[] list = calculator.calculate(a, b, c);
	}

}

class Calculator {
	public Double[] calculate(double a, double b, double c) {
		Double[] list = new Double[3];
		if (a == 0) {
			list=(liniowe(a, b));
		} else {
			double delta;
			delta = b * b - 4 * a * c;
			if (delta < 0) {
				list[0]= Double.valueOf(-1);
				list[1]= Double.valueOf(-3);
				list[2]= Double.valueOf(-1);
			} else if (delta == 0) {
				double x;
				x = -b / ( 2 * a );
				list[0]= Double.valueOf(0);
				list[1]=x;
				list[2]= Double.valueOf(-1);
			} else {
				double x1, x2;
				x1 = ( -b + sqrt(delta) ) / ( 2 * a );
				x2 = ( -b - sqrt(delta) ) / ( 2 * a );
				list[0]= Double.valueOf(0);
				list[1]=x1;
				list[2]=x2;

			}
		}
		return list;
	}

	/**
	 * Oblicza równania liniowe
	 *
	 * @param a
	 * @param b
	 *
	 * @return -1 - dla równania tożsamościowego, -2 - dla równania sprzecznego, x dla równania liniowego
	 */
	private Double[] liniowe(double a, double b) {
		Double[] list = new Double[3];
		if (a == 0) {
			if (b == 0) {
				list[0] = Double.valueOf(-1);
				list[1] = Double.valueOf(-1);
			} else {
				list[0] = Double.valueOf(-1);
				list[1]= Double.valueOf(-2);
			}
		} else {
			double x;
			x = -b / a;
			System.out.print("Równanie liniowe, x = ");
			list[0]= Double.valueOf(0);
			list[1]=x;
		}

		list[2]= Double.valueOf(-1);
		return list;
	}
}