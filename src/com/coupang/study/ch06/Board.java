package com.coupang.study.ch06;

public class Board {
	
	String name = "김찬";
	int view = 0;
	boolean useNy = true;
	
	Board() {
		
	}
	
	Board(String name) {
		this.name = name;
	}
	
	Board(String name, int view) {
		this.name = name;
		this.view = view;
	}
	
	Board(String name, boolean useNy) {
		this.name = name;
		this.useNy = useNy;
	}
	
	Board(String name, int view, boolean useNy) {
		this.name = name;
		this.view = view;
		this.useNy = useNy;
	}
	
	public void say() {
		System.out.println("이름: " + name + ", 조회수: " + view + ", 사용여부: " + useNy);
	}

}
