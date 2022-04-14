package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		
		//일반적인 방식
		double pi = 3.14;
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값이 변경되는 경우
		pi = 3.1415926;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//final => 상수(Constant)처리로 초기화 이후 값 변경을 막을 수 있음
		//			+ 일반 변수는 소문자, 상수로 정의되는 변수는 대문자 이름 사용
		final double PI = 3.14;
		double result03 = PI*5*5;
		System.out.println(result03);
		
		//* 상수의 값을 변경하려고 할 때
		// PI = 3.1415926;
		// double result04 = PI*5*5;
		// System.out.println(result04);
		// 에러발생 : The 'final local Variable' : PI cannot be assigned
		// + Remove 'final' modifier of 'PI'
		
	}
	
}
