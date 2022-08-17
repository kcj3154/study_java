package com.coupang.study.ch04;

public class RandomSum2 {
	
	public static void main(String[] args) {
		
		int min = 1;
		int max = 100;
		int random1 = (int) ( (Math.random() * (max-min)) + min);
		int random2 = (int) ( (Math.random() * (max-min)) + min);
		int result = 0;
		int min2;
		int max2;
		
		if (random1>random2) {
			max2 = random1;
			min2 = random2;
		}else {
			max2 = random2;
			min2 = random1;
		}
		for(int i = min2 ; i<=max2 ; i++) {
			result +=i;
		}
		System.out.println("랜덤정수" + min2 + " , " + max2 + "사이의 합은 " + result + "이다.");
		
		int resultA = (max2+min2)*(max2-min2+1)/2;
		System.out.println("확인 \n" + resultA);
	}

}
