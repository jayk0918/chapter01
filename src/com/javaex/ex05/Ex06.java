package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// 배열 실험 (실제값)
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = new int[3]; // 이번에는 다른 아파트를 건축
		/*	arrB[0] = arrA[0];	// 다른 배열에 + arrA의 값을 필요로 할 떄 + 정확한 값을 모를 때
			arrB[1] = arrA[1];
			arrB[2] = arrA[2];	*/
		
		for(int i=0; i<arrA.length; i++) { // i에 해당하는 규칙이 같기 때문에 for문 이용 가능
			arrB[i] = arrA[i];
		}
		
		// 출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("==================");
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("==================");
		
		System.out.println("arrA[1] 값을 100으로 변경"); // 의도 : arrA[1]만 변경되는가?
		arrA[1] = 100;
		
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("==================");
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		// 실험결과 : arrA[1] = 100, arrB[1] = 6
		// arrA[1]은 
		// 하지만 arrB는 arrA와 다른 배열(서로 메모리 주소가 다름)
		// arrB는 처음 arrA를 import한 시점인 3, 6, 9일때 실행하였음
		// 이후 arrA[1]이 100으로 변경된 시점에서 import하지 않았으므로 6 값이 출력됨
		
	}

}
