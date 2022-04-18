package com.javaex.ex04;


public class Ex04 {

	public static void main(String[] args) {

		// for 반복문_연습문제
		// 1부터 10까지의 합을 구하는 프로그램
		
		// 변수선언(핵심) => sum = sum+i (합계 = 합계 + i)
		// i++로 1씩 증가시켜주고 i<=10을 통해 10까지만 연산하도록 탈출조건 부여
		
		//Q1.
		/*
		int sum = 0;
		
		for(int i = 0; i<=10; i++) {
			sum = sum+i;
		}
		
		System.out.println("1부터 10까지의 정수의 합은 " + sum + " 입니다.");
		*/
		
		
		//Q2.
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum = sum+i;
			System.out.println(i + "까지의 합은 " + sum);
		}
		int lastSum = sum;
		System.out.println("1부터 10까지의 정수의 합은 " + lastSum + " 입니다.");
	}

}
