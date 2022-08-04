package com.coupang.study.ch03;

public class LogicalOperatorExample {
	
	public static void main(String[] args) {
		
//		&& = & : and : 논리곱 : 연산 참 참 참, 나머지 폴스
//		|| = | : or : 논리합 : 연산 참 폴스 참, 폴스 참 참, 참 참 참, 폴스 폴스 폴스
//		^ : 배타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참		
		
		int a = 65;
		
		boolean result = (a >=65);
			System.out.println("result: " + result);
			
		boolean result2 = (a <= 90);
			System.out.println("result: " + result2);
		
		if(a >=65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if(a >=65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		System.out.println("======================================");
		
		if(a >= 65 | a <=90 ) {
			System.out.println("둘 다 참");
		}
		
		if(a >= 66 | a <=90 ) {
			System.out.println("한개만 참");
		}
		
		if(a >= 66 | a <=50 ) {
			System.out.println("둘 다 폴스 안보임");
		}
		
		
		
		if(a >= 65 || a <=90 ) {
			System.out.println("둘 다 참");
		}
		
		if(a >= 66 || a <=90 ) {
			System.out.println("한개만 참");
		}
		
		if(a >= 66 || a <=50 ) {
			System.out.println("둘 다 폴스 안보임");
		}
		
		System.out.println("=======================================");
		
		if(a >=65 ^ a <=50) {
			System.out.println("참 폴 ㅎㅇ");
		}
		
		if(a >=66 ^ a <=65) {
			System.out.println("폴 참 ㅎㅇ");
		}
		
		if(a >=65 ^ a <=90) {
			System.out.println("참 참 ㅂㅇ");
		}
		
		if(a >=66 ^ a <=50) {
			System.out.println("폴 폴 ㅂㅇ");
		}
		
			
		
		
		
	}

}
