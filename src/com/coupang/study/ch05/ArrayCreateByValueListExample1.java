package com.coupang.study.ch05;

public class ArrayCreateByValueListExample1 {
	
	public static void main(String[] args) {
		
		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemistry = {88,99,45,86,34};
		
		String[] name = {"김찬중", "장동건", "고소영"};
		
		
		System.out.println("내 화학 성적 : " + scoreChemistry[1]);
		
		System.out.println("누굴까 : " + name[2]);
//==================================================================================
		
		System.out.println("==============================");
		
//==================================================================================		
		
		int totalscore = 0;
		for(int i = 0; i < 5; i++) {
			totalscore += scoreChemistry[i];
		}
		
		System.out.println("다섯명의 화학 성적 총합은 " + totalscore + "점");
		System.out.println("다섯명의 평균 화학 성적은 " +(double)totalscore/5 + "점");
		
		System.out.println("==============================");
		
		System.out.println(scoreChemistry.length);
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += scoreChemistry[i];
		}
		
		avg = (double)sum/scoreChemistry.length;
		System.out.println("다섯명의 평균 화학 성적은 " + avg + "점");
		
		
		
		
		
	}

}
