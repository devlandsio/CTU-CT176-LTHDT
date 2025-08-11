package com.ctu.dangth.buoi1;

import java.util.Scanner;

public class Bai6 {
	static int nhapSo(String name) {

		Scanner sc = new Scanner(System.in);
		int x; 
		
		do {
			try {
				System.out.print("Nhap so "+name+": ");
				x = sc.nextInt();
				return x;
				
			} catch (Exception e) {
				System.out.println("Nhap khong dung dinh dang");
				sc.nextLine();
			} 
		} while (true);
	}
	
	static boolean isPrime (int n) {
		if (n<2)
			return false;
		for (int i = 2; i<=Math.sqrt(n); i++) 
			if (n%i==0)
				return false;

		return true;
	}
	
	static void htNhiPhan(int n) {
		System.out.println(Integer.toBinaryString(n));
	}
	
	public static void main(String[] args) {
		int n = nhapSo("n");
		System.out.println(n+" "+ (isPrime(n) ? "la " : "khong la ")+ "so nguyen to");
		

		htNhiPhan(n);
	}
}
