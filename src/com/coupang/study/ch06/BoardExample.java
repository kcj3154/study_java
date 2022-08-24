package com.coupang.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
		
		Board board = new Board();
		Board board1 = new Board("김찬중");
		Board board2 = new Board("김찬중" , 351);
		Board board3 = new Board("김찬중" , false);
		Board board4 = new Board("김찬중" , 502, false);
		
		board.say();
		board1.say();
		board2.say();
		board3.say();
		board4.say();

	}

}
