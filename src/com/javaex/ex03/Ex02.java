package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		//if - else 조건문
		Scanner sc = new Scanner(System.in);
		System.out.print("점수:");
		int point = sc.nextInt();
		
		//if = true일때만 실행되는 영역
		if(point>=60) {
			System.out.println("합격입니다.");
		}
		
		//if = false일때만 실행되는 영역
		else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
	}

}
