package com.coupang.study.ch04;

public class ForPrintFrom1To10Example {
	
	public static void main(String[] args) {
		
		//1부터 10까지 더하는 프로그램 작성
		
		int sum = 0;
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(i);
			sum = sum + i; // sum += i;
		}
		
		System.out.println("sum: " + sum);
		
	
		double min = 10;
		double max = 45;
		double random = (int) ( (Math.random() * (max-min)) + min );
		System.out.println(random);
		
	}

}
