package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// switch-case 조건문
		// if-else구문에서 == 조건이 반복되었을 때 보다 가독성 좋은 조합
		// == 조건 원툴이므로 다른 조건은 표현불가능 (>,<, >= 같은 조건들)
		// 대표적 예시가 Ex09의 code == 1 / == 2.....등의 상황임
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과목번호:");
		int code = sc.nextInt();
		
		switch(code) {
			case 1:
				System.out.println("101호");
				break;
			case 2:
				System.out.println("202호");
				break;
			case 3:
				System.out.println("303호");
				break;
			case 4:
				System.out.println("404호");
				break;
			default:
				System.out.println("상담원");
				break;
		}
		
		sc.close();
		
		
		
	}

}
