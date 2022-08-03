package com.coupang.study.ch03;

public class AritheticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		int result1 = v1+v2;
		int result2 = v1-v2;
		int result3 = v1*v2;
		int result4 = v1/v2; // /=몫
		int result5 = v1%v2; // %=나머지
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		double result6 = v1 / v2;
		System.out.println(result6);
		double result7 = (double) v1 / v2;
		System.out.println(result7);
		
		double y = 3.14;
		double i = 1;
		double y2 = y%i;
		System.out.println(y2);
		
//=================================================================
		
		System.out.println("======================");
		
		int resultA = 8+7+5;
		System.out.println(resultA);
		
		int resultB = 1+9+5;
		System.out.println(resultB);
		
		int resultC = 5+6+6;
		System.out.println(resultC);
		
		int resultD = 4+7+1;
		System.out.println(resultD);

		int resultE = 7+5+5;
		System.out.println(resultE);
		
//===========================================================================		
	
		
		System.out.println("======================");
		
		double a = ((double)5/3);
		double b = ((double)5/8);
		double c = ((double)49/5);
		
		double resultV = (a-b)*c;
		System.out.println(resultV);
		
		System.out.println("======================");
		
//===========================================================================			
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		System.out.println("======================");
		
		avg("홍길동", 60,70,85,90,45);
		avg("박말순", 50,75,70,60,70);
		avg("고장난", 55,60,64,58,90);
		avg("도롱뇽", 80,70,63,88,78);
	}

	   
		public static void sum(int q, int w, int e) {
			
			System.out.println(q + "+" + w + "+" + e + "=" + (q+w+e) );
			
		}
		


		public static void avg(String name, int english, int math, int physics, int music, int atheletic) {
				
				System.out.println(name+ "의 평균점수는" + (double) (english+math+physics+music+atheletic)/5 + "점 입니다.");
		
		}
}

//================================================================        
