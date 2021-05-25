package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	    double pi = 3.14;
	    double v = 4.0 / 3.0;
	    
		System.out.print("반지름:");
		double half = sc.nextDouble();
		System.out.println("구의부피는: " + ( v * pi * ( half * half * half ) ) + " 입니다.");
		
		System.out.print("반지름:");
		double half1 = sc.nextDouble();
		System.out.print("구의부피는: " + ( v * pi * ( half1 * half1 * half1 ) ) + "입니다.");

	}

}
