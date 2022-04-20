package com.javaex.ex05;

public class Ex07_1 {

	public static void main(String[] args) {
		// 배열 비교연습문제_self
		// 연습문제에서 배열이 같은지의 기준 : 배열 내부 값, lenght, 모두 같아야 함
		
		// 검증순서 1 : length부터(총 방의 개수가 다르면 이미 값은 비교하나마나)
		// 검증순서 2 : 배열 내부값 비교
		
		int[] leftArray = new int[] {10,20,30,50};
		int[] rightArray = new int[] {10,20,30,40};
		
		if(leftArray.length == rightArray.length) {
			
			for(int i = 0; i<leftArray.length; i++) {
				
				if(leftArray[i] != rightArray[i]) {
					System.out.println( i + "번째 값이 다릅니다."); //0번째 숫자라고 시작함
					
				}else {
					System.out.println();
				}
			}
			
		}else {
			System.out.println("두 배열의 크기가 다릅니다.");
		}
		
		
		
		
	}

}
