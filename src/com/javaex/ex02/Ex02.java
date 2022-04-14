package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//사용자 입력값 받기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 키보드 입력값
		System.out.println("입력한 숫자는"+ " " + num + " " + "입니다.");
		sc.close();
		
	}
	
}
