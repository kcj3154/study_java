package com.coupang.study.ch04;

public class IfExample2 {
	
	public static void main(String[] args) {
		
		int price1 = 10000;
		int grade = 1;
		double price2;
		
		if(grade == 1) {
			price2 = price1*1.05;
			System.out.println("일반"+price2);
		}else if(grade == 2) {
			price2 = price1*1.1;
			System.out.println("브론즈"+price2);
		}else if(grade == 3) {
			price2 = price1*1.15;
			System.out.println("실버"+price2);
		}else if(grade == 4) {
			price2 = price1*1.2;
			System.out.println("골드"+price2);
		}else {
			price2 = price1*1.27;
			System.out.println("플래티넘"+price2);
		}
	}
	
}