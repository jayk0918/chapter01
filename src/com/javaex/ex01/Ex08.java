package com.javaex.ex01;

public class Ex08 {
	
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //(int)/(int) = 몫
		System.out.println(a%b); //나머지
		
		//% advanced
		System.out.println("===============");
		System.out.println("산술연산자 % 자세히");
		System.out.println("===============");
		System.out.println(7/2);	//3
		System.out.println(7.0/2);	//3.5
		System.out.println(7%2);	//1
		System.out.println(7.0%2.0);//1.0 (실수)
		
		//부호 연산자
		int var = -3;
		int pVar = +var; // + : (+) + (-3) = -3
		int mVar = -var; // - : (-) - (-3) = 3
		System.out.println(pVar);
		System.out.println(mVar);
		
		//증감 연산자
		System.out.println("증감연산자");
		//++a 실험
		System.out.println(a);	// 7 , int a = 현재 초기화된 상태
		System.out.println(++a);// 8 , ++로 1이 더해짐
		System.out.println(a); 	// 8, 이제 a는 초기화때 7이 아님
		
		System.out.println(b);	// 2
		System.out.println(--b);// 1 (--b)
		System.out.println(b);	// 1
		
		//a++ 실험
		System.out.println(a);	// 8 , 현재값
		System.out.println(a++);// 8 , 출력되는 값은 그대로?
		System.out.println(a);	// 9 , 1 증가되었음
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		// 결론
		// ++a 와 a++의 차이
		// 같은 라인에서 작업하는 서순에 따라 연산결과가 달라지는 것
		// ++a : (++ : 1을 더해라) + (a를 출력해라)
		// a++ : (a를 출력해라) + (++ : 1을 더해라) = 이후 출력에서 1이 더해진 값이 나옴
		
	}
}
