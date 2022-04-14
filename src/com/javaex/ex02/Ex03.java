package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		///////////////////////////////////////
		// 입력값을 이름 다음에 오도록 (문제 해석 오류)//
		///////////////////////////////////////
		
		/*
		System.out.println("이름을 입력해주세요");
		System.out.println("이름 : " + name);
		System.out.println("당신의 이름은 " + name + " 입니다.");
		System.out.println("--------------------------------");
		System.out.println("이름을 입력해주세요");
		System.out.println("이름 : " + name);
		System.out.println("나이를 입력해주세요");
		System.out.println("나이 : " + age);
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		*/
		
		
		// 작성안 정정
		
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		sc.close();
		
		
	}
	
	
	
}
