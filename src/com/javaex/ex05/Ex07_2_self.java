package com.javaex.ex05;

public class Ex07_2_self {

	public static void main(String[] args) {
		// 배열 비교연습문제_self
		// 연습문제에서 배열이 같은지의 기준 : 배열 내부 값, lenght, 모두 같아야 함
		
		int[]leftArray = new int[] {10,20,30};
		int[]rightArray = new int[] {10,20,30};
		
		// 둘다 3의 크기를 가질것이므로 length는 같을 것
		if(leftArray.length==rightArray.length) {
			System.out.println();
		}else {
			System.out.println("두배열의 크기가 다릅니다.");
		}
		
		// 서로 다른 배열이기 때문에 각자의 배열 내부값을 변경하면 달라질 것
		leftArray[1] = 40; //test
		
		if(leftArray[0]==rightArray[0]) {
			System.out.println();
		}else {
			System.out.println("0 번째 값이 다릅니다.");
		}
		
		if(leftArray[1]==rightArray[1]) {
			System.out.println();
		}else {
			System.out.println("1 번째 값이 다릅니다.");
		}
	}

}
