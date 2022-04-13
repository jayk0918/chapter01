package com.javaex.chapter01;

public class Ex01 {
	
	public static void main(String[] args){
		
		// 논리 설계		
		int myAge;
			//int : 자료형 중 정수형
		myAge = 25;
		
		// 출력		
		System.out.println(myAge);
		
		// 변경	
		myAge = 26;
		System.out.println(myAge);
		
		// 자료형 실험 (정수형)
		byte no = -128;
		System.out.println(no);
		
		long no2 = 9223372036854775807L; //long을 사용하고자 할 때는 숫자 뒤에 L을 붙여야 함
		System.out.println(no2);
		
		long no3 = 147483642; //long이 int범위 이내의 숫자일 경우 L은 필요없음
		System.out.println(no3);
		
		//입력 방식 선택
		int myAge_2 = 20; // 변수선언 + 초기화 = 값이 확실할 때 주로 사용
		// vs
		int myAge_3;
		myAge = 20;
		// 변수선언을 우선적으로 한 다음 향후 값이 결정되었을 때 부여하는 방법
	
		//////////////////////////
		// 변수선언(소문자) & 초기화 //
		/////////////////////////
		
		// 선언 : 메모리 -줘-
		// 초기화 : 변수값 부여
		
		// 여러개의 변수일 때 선언 후 초기화
		int var01;
		int var02;
		int var03;
		// int var01, var02, var03; 과 같은 의미,
		// 지금은 앞서 같은 이름으로 작명되어 중복 변수 선언으로 오류 (둘 중 택1)
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		// 여러개의 변수일 때 변수+초기화 병행
		int var04 = 10;
		int var05 = 20;
		int var06 = 30;
		// int var04 = 10, var05 = 20, var06 = 30;과 같음
		
		// 노란색 오류 : The value of the local variable(로컬 변수) + (변수명) is not used
		// 변수를 안썼으니 체크해보라는 뜻
		
	}
}
