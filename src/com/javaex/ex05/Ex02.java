package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		//배열의 선언 & 생성
		
		int[] intArray = new int[5];
		// [] : 아파트(배열)생성 , intArray : 아파트(배열)명
		// new : 새로운 영역에 생성, [(숫자)] : 아파트 평수
		// new int[5]는 배열을 선언함과 동시에 결정하여 입력해야 함
		
		intArray[0] = 3; // [0] = 방 번호는 0번부터 시작
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 15;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		// 반복적 작업
		
		for(int i=0; i<5; i++) {
			System.out.println(intArray[i]);
		}
	}

}
