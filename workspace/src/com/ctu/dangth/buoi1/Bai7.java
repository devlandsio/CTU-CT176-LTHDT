package com.ctu.dangth.buoi1;

import java.util.Scanner;

public class Bai7 {
	static String tachTen(String s) {
		return s.substring(s.trim().lastIndexOf(" ") + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ho ten: ");
		String hoTen = sc.nextLine();

		System.out.println("Ten la: " + tachTen(hoTen));
	}
}
