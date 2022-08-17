package com.coupang.study.ch04;

public class ForExample {
	
	public static void main(String[] args) {
		
//		**********
//		**********
//		**********
//		**********
//		**********
//		출력하는 프로그램을 만드시오
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
//		**********
//		*		 *
//		*        *
//		*		 *
//		**********
//		출력하는 프로그램을 만드시오
		
		System.out.println("====================");
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				if(i*j == 0 || i==4) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("*");
		}
		System.out.println("");
		
		
		int z=4;
		int k;
		for(int i=0; i<5; i++) {
			k=9;
			for(int j=0; j<10; j++) {
				if(i*j*z*k == 0) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				k--;
			}
			z--;
			System.out.println("");
		}
		System.out.println("");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		
		
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		1 3 5 7 90
//		출력하는 프로그램을 만드시오
		
		for(int i=1; i<=11; i++) {
			for(int j=1; j<i; j++) {
				if(j%2==0 && i==11 && j!=10) {
					System.out.print(" ");
				}else {
					System.out.print(j%10);
				}
			}
			System.out.println("");
		}
		
		System.out.println("====================");
	
		
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}

}
