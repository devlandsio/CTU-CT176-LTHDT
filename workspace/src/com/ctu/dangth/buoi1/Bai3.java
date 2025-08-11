package com.ctu.dangth.buoi1;

import java.util.Scanner;

/*
 * Bài 3: Viết chương trình nhập vào một ký tự bất kỳ, 
 *        in ký tự đó ra màn hình. Chương trình kết 
	      thúc khi nhập ký tự ‘q’.
 */
public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		boolean check = false;

		do {
			System.out.print("Nhap ky tu: ");

			String s = sc.nextLine();
			if (s.length() > 1)
				System.out.println("Nhap lai 1 ky tu: ");

			if (s.charAt(0) == 'q')
				check = true;
		} while (!check);
		System.exit(0);
	}
}
