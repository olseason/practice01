package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a = 500;
		int b = 100;
		int c = 50;
		int d =10;
		
		
		System.out.print("500원 개수:");
		int fih = sc.nextInt();
		
		System.out.print("100원 개수:");
		int h = sc.nextInt();
		
		System.out.print("50원 개수:");
		int fif = sc.nextInt();
		
		System.out.print("10원 개수:");
		int t = sc.nextInt();
		
	    int add = a*fih + b*h+ c*fif+ d*t;
		System.out.println("동전의 총합은" + add + "원 입니다.");
		
		
		
		System.out.print("500원 개수:");
		int fih1 = sc.nextInt();
		
		System.out.print("100원 개수:");
		int h1 = sc.nextInt();
		
		System.out.print("50원 개수:");
		int fif1 = sc.nextInt();
		
		System.out.print("10원 개수:");
		int t1 = sc.nextInt();
		
	    int add1 = a*fih1 + b*h1+ c*fif1+ d*t1;
		System.out.print("동전의 총합은" + add1 + "원 입니다.");
		

	}

}
