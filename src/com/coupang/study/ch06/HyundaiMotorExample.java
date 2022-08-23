package com.coupang.study.ch06;

public class HyundaiMotorExample {

	public static void main(String[] args) {
		
		HyundaiMotor hyundaimotor = new HyundaiMotor();
		
		for (int i = 0; i< hyundaimotor.name.length; i++) {
			System.out.println("현대자동차 :" + hyundaimotor.name[i]);
		}

	}

}
