package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		// do-while문
		// while 작성순서와 반대
		// do{ 실행문구 } + while(조건)
		// 역순이기 때문에 무조건 한번은 실행이 됨
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		int sum = 0;
		int num;
		
		do {
			num = sc.nextInt();
			sum = sum+num;
			System.out.println("합계: " + sum);
		}while(num!=0);
		System.out.println("종료");
		
		// 위에부터 차례로 질문하여 연산하되 0일경우에는 반복하지 않는 식
		// while문으로 재구성한다면 아래와 같음
		
		while(true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계 " + sum);
			if(num==0) {
				break;
			}
		}
		System.out.println("종료");
		
		sc.close();
	}

}
