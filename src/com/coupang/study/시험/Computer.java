package com.coupang.study.시험;

public class Computer extends Calculator {
	@Override
	public double cir(double r) {
		System.out.println("Computer 객체의 면적을 구하는 프로그램 실행");
		return Constants.PAI_2 * r * r;
	}
}
	

