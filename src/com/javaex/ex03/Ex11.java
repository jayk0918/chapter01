package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		//월을 입력받고 _ 해당월의 일수를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
			case 1 :
				System.out.println("31일 입니다.");
				break; 	//break로 switch-case문을 탈출하지 않으면 case 1의 값 이후에 다음 값도 출력됨
						//break를 만날때까지 하위 case 출력을 반복함
				
			case 2 :
				System.out.println("28일 입니다.");
				break;
				
			case 3 :
				System.out.println("31일 입니다.");
				break;
				
			case 4 :
				System.out.println("30일 입니다.");
				break;
				
			case 5 :
				System.out.println("31일 입니다.");
				break;
				
			case 6 :
				System.out.println("30일 입니다.");
				break;
				
			case 7 :
				System.out.println("31일 입니다.");
				break;
				
			case 8 :
				System.out.println("31일 입니다.");
				break;
				
			case 9 :
				System.out.println("30일 입니다.");
				break;
				
			case 10 :
				System.out.println("31일 입니다.");
				break;
				
			case 11 :
				System.out.println("30일 입니다.");
				break;
				
			default :
				System.out.println("31일 입니다.");
				break;
		}
		
		sc.close();
		
		
	}

}
