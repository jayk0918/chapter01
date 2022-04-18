package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//점수 입력 + 3의 배수인지를 판별
		//배수면 나머지값이 0일테니 score%3==0을 채용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		if(score%3==0) {
			System.out.println(score + "은(는) 3의 배수 입니다.");
		}else {
			System.out.println(score + "은(는) 3의 배수가 아닙니다.");
		}
		
		sc.close();
		
		
	}

}
