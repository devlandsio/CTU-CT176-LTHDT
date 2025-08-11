package com.ctu.dangth.buoi1;

import java.util.Scanner;

public class Bai5 {

	static void giaiPtB2(double a, double b, double c) {
		if (a != 0) {
			double delta = b * b - (4 * a * c);
			if (delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("PT co 2 Nghiem PB: x1 = " + x1 + " - x2 = " + x2);
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("PT co 1 Nghiem kep: x = " + x);
			} else
				System.out.println("PT vo nghiem!");

		} else
			giaiPtB1(b, c);
	}

	static void giaiPtB1(double a, double b) {
		if (a != 0) {
			double x = -b / a;
			System.out.println("PT co nghiem la: x = " + x);

		} else {
			if (b == 0)
				System.out.println("PT co vo so nghiem!");
			else
				System.out.println("PT vo nghiem");
		}
	}

	static double nhapSo(String name) {

		Scanner sc = new Scanner(System.in);
		double x;

		do {
			try {
				System.out.print("Nhap so " + name + ": ");
				x = sc.nextDouble();
				return x;

			} catch (Exception e) {
				System.out.println("Nhap khong dung dinh dang");
				sc.nextLine();
			}
		} while (true);
	}

	public static void main(String[] args) {
		double a = nhapSo("a");
		double b = nhapSo("b");
		double c = nhapSo("c");

		giaiPtB2(a, b, c);
	}

//	check sai số
//	double eps = 1e-12;if(Math.abs(delta)<=eps)
//	{
//		// coi như delta = 0
//	}

}
