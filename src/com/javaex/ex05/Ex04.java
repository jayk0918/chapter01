package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		// 배열문법 한 호흡 작성법
		
		int[]intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		for(int i = 0; i<intArray.length; i++) {
			System.out.print(intArray[i]);
		}
		System.out.println();
		// vs
		int[]intArray2 = new int[] {3,6,9};
		for(int i = 0; i<intArray2.length; i++) {
			System.out.print(intArray2[i]);
		}
		System.out.println();
		// 방 개수를 정하지 않고 직접 입력대상값 투입
		// vs
		int[]intArray3 = {3,6,9};
		for(int i = 0; i<intArray3.length; i++) {
			System.out.print(intArray3[i]);
		}
		System.out.println();
		//(비추천)_생략되는 내용이 너무 많음
		
		System.out.println("====================");
		
		// 실수를 담는 배열
		double[] dArray = new double[3];
		dArray[0] = 1.4;
		dArray[1] = 3.14;
		dArray[2] = 7; //자동형변환 되었음
		
		for(int i=0; i<dArray.length; i++) {
			System.out.println(dArray[i]);
		}
		
		System.out.println("====================");
		// char
		char cArray[] = new char[5];
		cArray[0] = '안';
		cArray[1] = '녕';
		cArray[2] = '하';
		cArray[3] = '세';
		cArray[4] = '요';
		
		for(int i=0; i<cArray.length; i++) {
			System.out.print(cArray[i]);
		}
		System.out.println();
		
		// boolean
		boolean[] bArray = new boolean[3];
		
		bArray[0] = true;
		bArray[1] = false;
		bArray[2] = 3==5;
		
		for(int i=0; i<bArray.length; i++) {
			System.out.println(bArray[i]);
		}
	}

}
