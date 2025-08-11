package com.ctu.dangth.buoi1;

import java.util.Scanner;

public class Bai8 {
	
	static int[] nhap(int n) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("A["+i+"]: ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	static void xuat(int []arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.println("A["+i+"]: "+arr[i]);
		}
	}
	
	static int demSo(int[] arr, int x) {
		int d=0;
		for (int i=0; i<arr.length; i++) 
			if (arr[i] == x)
				d++;
		return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x;
		int[] arr;
		
		System.out.println("Nhap so luong phan tu: ");
		n=sc.nextInt();
		
		arr = nhap(n);
		
		xuat(arr);
		
		System.out.println("Nhap phan tu muon dem: ");
		x=sc.nextInt();
		
		System.out.println(demSo(arr, x));
		
		
	}
}
