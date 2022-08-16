package com.coupang.study.ch04;

public class IfExample4 {
	
	public static void main(String[] args) {
		
// int 타입의 변수를 1개선언하고
// 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오
		
		int a=1;
		
		if(a !=0){
			if(a%2==0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
	
			else {
			// a==0
			System.out.println("0");
		}
		
		}
		
	}

