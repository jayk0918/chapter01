package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		/* 	8시간까지는 시간당 10000원
			8시간 초과시 시간당 1.5배
			-시간은 고려하지 않음
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		
		if(time>8){
			int money = (time-8)*15000 + 80000; // 15000 : 1.5배값 & 80000(기존 8시간 시급)
			System.out.println("임금은 " + money + "원 입니다.");
		}else if(time<0) {
			System.out.println("");
		}else {
			int money = time * 10000;
			System.out.println("임금은 " + money + "원 입니다.");
		}
		
		// 15000 -> (10000 * 1.5), 80000 -> (10000*8)
		// 결과값이 중요한게 아니라 향후 수정을 염두에 두어야 함
		sc.close();
		
	}

}
