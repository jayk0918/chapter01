package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		
		// I like Java(0 ~ 4 반복출력)
		
		//while (True) => while문 안으로 & 다음 질문도 다시 물어봄
		//while (False) => while문 밖으로
		//공략 : True판독 횟수가 반복이므로 이것을 제어(기본적으로 무한대로 물어봄)
		//while문의 완성 : 초기값 + 조건식 + 증감식(탈출조건) 설계&조합
		
		
		int i = 0;
		while(i<5) { // i<5이면 true
			System.out.println("I like Java" + i); // 초기값 = 0;
			i++;
		}
		
		
		
		
		
	}

}
