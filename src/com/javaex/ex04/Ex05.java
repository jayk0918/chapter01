package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		// 구구단 출력하기 (2단 ~ 9단)
		// 설계 : result = 0인 상태에서 대입
		// dan은 2단부터 9단까지 2<=dan<=9
		// i는 1부터 9까지 1<=i<=9
		// 2중 for문으로 구성, i가 1~9까지 순환하면 dan이 +1되어야 함(i = 하위 for문 당첨)
		
		int result = 0;
		for(int dan = 2; dan<=9; dan++) {
			for(int i = 1; i<=9; i++) {
				result = dan*i;
				System.out.println(dan + " * " + i + " = " + result);
			}
		}
		
		
	}

}
