package com.coupang.study.ch04;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
// 		2단 출력 프로그램 w
// 		2 * 1 = 2
		
		
		//for(int i=1; i<=9; i++) {
			//System.out.println("2 * " + i + " = " + (2 * i));
		//}
		
		
		// 2단 부터 9단까지 출력하는 프로그램 작성 : 6줄 이상 되지 않
		
		for(int i=2 ; i<=9 ; i++) {
				System.out.println("---------------" + i + " 단" + "---------------");
				for(int j=1; j<=9; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
		}
		
}
