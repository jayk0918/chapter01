package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		// 별 찍기 Q1.
		// 6 * 6
		// 이중 for문 구성 (별 6개 반복) * (6줄 반복)
		
		for(int line = 1; line<=6; line++) {
			for(int i = 1; i<=6; i++) {
				char star = '*';
				System.out.print(star);
			}
			System.out.println();
		}
		
		/* x축, y축 이름 활용
		 * 
		 * for (int y=1; y<=6; y++){
		 * 	for (int x=1; x<=6; x++){
		 * 		System.out.print("*");
		 * 		}
		 * 	System.out.println();
		 * 	}
		 * 
		 * */
		
	}

}
