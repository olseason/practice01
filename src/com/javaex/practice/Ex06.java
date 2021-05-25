package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i);   // -> i는 10이라고 설정하였기 때문에 10이 나옴  
		System.out.println(n);   // -> n은 i++ 이라 10에 나누기 2에 대한 나머지의 값으로 0이 나옴 

	}

}
