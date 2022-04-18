package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// while 반복문 문제 (구구단)
		// 빌드업
		// 초기값 : dan(숫자 단 입력) / i = 1( -> *1)
		// 조건식 : dan * i / 별도의 변수를(result) 선언할 수도 있을 듯 / 단 이것은 반복문 안에 위치해야
		// 증감식 : i가 1이고, 9까지 곱연산을 해야하므로 i<10으로 설정/ i++;
		// 8단을 예시로
		/* dan(8) * i(1~9) (True) = dan*i	i++;
		 * dan(8) * i(10)_탈출 (False) = dan*i i++;
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		int dan = sc.nextInt();
		int i = 1;
		int result;
		
		while(i<10) {
			result = dan*i;
			System.out.println(dan + " * " + i + " = " + result);
			i++;
		}
		
		sc.close();
		
		
	}

}
