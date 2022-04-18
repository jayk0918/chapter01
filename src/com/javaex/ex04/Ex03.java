package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// for 반복문_ 더 자주 사용하게 될 것임 & 처음부터 이쪽으로 접근해야 함
		// for(초기화, 조건식, 증감식_탈출조건)으로 조합하여 사용
		// 반복 routine = 초기화 -> (조건식 -> 증감) , 조건식과 증감식이 반복되며, 탈출조건이 성립되면 탈출
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
		int result;
		
		//(초기화; 조건식; 증감식),(화면 출력이 없으면)i=0,(있으면)i=1로 통상운
		for(int i = 1; i<10; i++) { 
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
		}
		
		sc.close();
		
		
	}

}
