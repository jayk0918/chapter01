package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				break; // i = 6일때 true, break;를 만나서 for문의 반복이 중단됨
			}
		System.out.println(i);
		}
		
		for(int i = 1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				continue; // i = 6일때 true, continue;를 만나는데, for문의 반복은 계속
						  // 이때 6은 continue의 영향으로 print 구문을 만나지 못해 출력되지 않음
			}
		System.out.println(i);
		}
		
	}

}
