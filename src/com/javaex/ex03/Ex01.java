package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int point = sc.nextInt();
		//if 조건문
		if (point>=60){
			System.out.println("합격입니다.");
		};//위에 if가 false일 때 {}안에 못들어가고 여기까지 쫓겨남
		
		sc.close();
	}
	
	
}
