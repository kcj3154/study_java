package com.coupang.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		System.out.println("iphone name: " + iphone.name);
		
		
		iphone.pr();
		
		
		Car car = new Car();
		
		System.out.println("car.name: " + car.name);
		
		
		
		Handbag_2 handbag_2 = new Handbag_2();
		
		System.out.println("handbag_2.name: " + handbag_2.name);
		
		
		
		car.name = "소나타";
		
		System.out.println("car.name: " + car.name);

	}

}
