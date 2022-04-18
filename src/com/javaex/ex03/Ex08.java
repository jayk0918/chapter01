package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		// 입력받고
		// 양수 - 짝수 vs 홀수
		// 음수 - just 음수
		// 0이면 - 0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		if(num>0) {	// 양수
			if(num%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else if(num==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		// 상식적으로 생각했을 때 흐름이 이어지는 코드가 좋은 코드
		// 0부터 해도 되지만 / 문제에서 양수 - 음수 - 0의 흐름이었으니 음수부터 했으면 더 좋았을 듯
		
		sc.close();
		
		
	}
	
}
