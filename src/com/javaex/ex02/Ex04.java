package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		
		sc.close();
		
		// 스캐너를 여러개 사용하여 코드를 작성할 수 있지만 굳이 그럴 필요가 있을까
		// 하게 된다면 sc2이런 식으로 작명해서 사용 가능하긴 함
		
		
		
		
		
		
		
	}
	
	
}
