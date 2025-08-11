package com.ctu.dangth.buoi1;

import java.util.Scanner;

public class Bai4 {

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
	
	static void tinhTong(int a, int b) {
		System.out.println("Tong cua hai so la: "+(a+b));
	}
	
	public static void main(String[] args) {
		
		int a = nhapSo("a");
		int b = nhapSo("b");
		
		tinhTong(a, b);
		
		
	}
}
