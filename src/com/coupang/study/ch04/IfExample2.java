package com.coupang.study.ch04;

public class IfExample2 {
	
	public static void main(String[] args) {
		
// 일반:1, 5% 할인적용
// 브론즈:2, 10% 할인적용
// 실버:3, 15% 할인적용
// 골드:4, 20% 할인적용
// 플래티넘:5, 2.7% 할인적용
		
		int price1 = 10000;
		int grade = 1;
		double price2;
		
		if(grade == 1) {
			price2 = price1*(1-0.05);
			System.out.println("정가가 " + price1 + "원인 물건의 일반 등급 할인가는: " + (int)price2 + "원");
		}else if(grade == 2) {
			price2 = price1*0.9;
			System.out.println("정가가 " + price1 + "원인 물건의 브론즈 등급 할인가는: " + (int)price2 + "원");
		}else if(grade == 3) {
			price2 = price1*0.85;
			System.out.println("정가가 " + price1 + "원인 물건의 실버 등급 할인가는: " + (int)price2 + "원");
		}else if(grade == 4) {
			price2 = price1*0.8;
			System.out.println("정가가 " + price1 + "원인 물건의 골드 등급 할인가는: " + (int)price2 + "원");
		}else if(grade ==5) {
			price2 = price1*0.973;
			System.out.println("정가가 " + price1 + "원인 물건의 플래티넘 등급 할인가는: " + (int)price2 + "원");
		} else {
			System.out.println("등급이 존재하지 않습니다.");
		}
		
	}
	
}