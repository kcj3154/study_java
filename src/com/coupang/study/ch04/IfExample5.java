package com.coupang.study.ch04;

public class IfExample5 {
	
	public static void main(String[] args) {
		
// int 타입의 변수를 2개 선언하고
// 두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오
		
		int a = 10;
		int b = 100;
		
		if (a>0 & b>0) {
			System.out.println("제1사분면");
		} else if (a<0 & b>0) {
			System.out.println("제2사분면");
		} else if (a<0 & b<0) {
			System.out.println("제3사분면");
		} else if(a>0 && b<0) {
			System.out.println("제4사분면");
		} else if(a==0) {
			System.out.println("x축 위");
		} else if(b==0) {
			System.out.println("y축 위");
		} else {
			// a==0 & b==0
			System.out.println("원점");
		}
		
	}
	
}