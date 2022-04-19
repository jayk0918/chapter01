package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		// 1~20까지의 수 중 2의배수 & 3의배수를 제외한 숫자 출력
		// 2의배수나 3의배수 공통이 아니라 하나만 걸려도 필터링 필요
		// ||를 사용
		
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("=================");
		
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				// continue가 아니고 빈칸으로 두더라도 기능은 작동함
			}else {
				System.out.println(i);
			}
			
		}
		
		System.out.println("=================");
		
		for(int i=1; i<=20; i++) {
			if(!(i%2==0 || i%3==0)) {
				System.out.println(i);
				// !(코드) : not을 부여하여 if안의 값을 false로 받아들이게끔 유도
				// i%2==0 || i%3==0이 true로 되기에 i로 출력되지 않음
			}
		
		}
	}
}