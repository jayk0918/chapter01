package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 버그 issue : int값 입력이후에 String 입력이 스킵될 수 있음
		// '엔터'때문에 입력된걸로 인식하는 오류
		// 해결법 : 이미 엔터값을 받아들인 것처럼 속이는 방법이 있음
		// ex)
		
			Scanner sc = new Scanner(System.in);
			
		 	System.out.println("나이를 입력해주세요");
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			sc.nextLine(); //--> 엔터값 소모처 (의미있는 코드는 아님, 에러극복용)
			
			System.out.println("이름을 입력해주세요");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
			
			sc.close();

	}

}
