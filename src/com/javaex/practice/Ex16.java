package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);
			
		System.out.print("상품가격:");
		double athing = sc.nextDouble();	
		
		System.out.print("받은돈:");
		double receive = sc.nextDouble();
		
		System.out.println("============================");

		System.out.println("받은돈:" + receive);
		System.out.println("상품가격:" + athing);
		System.out.println("받은돈:" + ( receive * 0.1 ) );
		System.out.println("상품가격:" + ( athing * 0.1 ) );
		System.out.println("잔액:" + ( receive - athing ) );
		

		
		
		
		
		
	}

}
