package com.coupang.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		int sum = arithmetic.sum(1, 2);
		int minus = arithmetic.minus(1, 2);
		int multiply = arithmetic.multiply(1, 2);
		int division = arithmetic.division(1, 2);
		
		arithmetic.say(sum);	
		arithmetic.say(minus);	
		arithmetic.say(multiply);	
		arithmetic.say(division);
		
		
		
		
	}
}