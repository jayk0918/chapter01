package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// 배열 실험 (주소값)
		// 배열은 '값'이 아닌 '주소값'을 다루는 것
		
		int[] arrA = new int[3]; // 메모리 내 배열 신규생성
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = arrA; // arrA의 주소가 복사됨(있던거 갖다쓰니까 new 안씀)
		
		arrA[1] = 100; // arrA[1] 변경
		
		
		for(int i = 0; i<arrA.length; i++) {
			System.out.print(arrA[i]);
		}
		// arrA의 1값은 변경
		System.out.println();
		System.out.println("====================");
		
		for(int i = 0; i<arrB.length; i++) {
			System.out.print(arrA[i]);
		}
		// arrB는 변경된 arrA를 링크하여 출력하는 것
		// 결과가 같다고 똑같은 과정을 밟은 것이 아님
		
	}

}
