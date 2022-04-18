package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		/* 	8시간까지는 시간당 10000원
		 	8시간 초과시 시간당 12000원
			-시간은 고려하지 않음
			time > 8 = * 12000
			time <= 8 = * 10000
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간:");
		int time = sc.nextInt();
		//int money
		
		if(time>8) {
			int money = ((time-8)*12000)+80000; // 80000 : 기존 8시간 시급
			System.out.println("임금은 " + money + "원 입니다.");
		}else if(time<0){
			System.out.println("");
		}else {
			int money = time*10000;
			System.out.println("임금은 " + money + "원 입니다.");
		}
		
		// print 구문을 현재는 각각 써줬지만 한꺼번에 작성할 수 있는 방법이 있음
		// 아까 해보려고 했다가 에러나서 포기하고 2번 쓴건데
		// if 구문 {}안에서 정해진 변수는 구문을 탈출하는 순간 소멸, 여기서는 money가 그 경우임
		// 생명연장을 위해서 if 구문이 들어가기 이전에 미리 변수를 선언해버리면 됨
		// 구문안에서는 변수명만 사용함
		
		
		sc.close();
		
	}
	
}
