package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("마일을 입력하세요:");
		double mile = sc.nextDouble();
		final double mile01 = 1.609;
		
		System.out.println( mile  + "마일은 "+ ( mile * mile01 ) + "킬로미터 입니다." );
		
		
		System.out.print("마일을 입력하세요:");
		double mile1 = sc.nextDouble();
		final double mile02 = 1.609;
		System.out.print( mile1  + "마일은 "+ ( mile1 * mile02 ) + "킬로미터 입니다." );
		
		
	}	

}
