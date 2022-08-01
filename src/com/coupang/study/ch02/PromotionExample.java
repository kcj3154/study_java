package com.coupang.study.ch02;

public class PromotionExample {
	
	public static void main(String[] args) {
		
//		자동 타입 변환 (promotion)		
//		작은 형이 큰 형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.
//		byte < short < int < long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
		
		short shortValue = byteValue;
		System.out.println("byteValue : " + byteValue);
		
		int intValue = shortValue;
		System.out.println("intValue: " + intValue);
		
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		
		
		
		// 작은형 (사칙연산) 큰형 = 큰형 
		// 예외) byte (사칙연산) short = int
		
//		----------		
		
//		int intValue2 = 134567890;
//		System.out.println("intValue: " + intValue);
		
//		byte byteValue2 = intValue2;
//		System.out.println("byteValue2: " + byteValue2 + " 입니다.!!!");
		
//		int intValue3 = 200;
//		System.out.println("intValue3: " + intValue3 + " 입니다.!!!");
		
//		double doubleValue = intValue3;
//		System.out.println("doubleValue: " + doubleValue + " 입니다.!!!");
		
		
		
	}

}
