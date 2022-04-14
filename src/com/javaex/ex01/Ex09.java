package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		// 관계연산자
		int n1 = 5;
		int n2 = 3;
		System.out.println(n1<n2); // 5<3? False
		System.out.println(n1>n2); // 5>3? True
		System.out.println(n1<=n2);
		System.out.println(n1>=n2);
		System.out.println(n1==n2); // == : equal
		System.out.println(n1!=n2); // != 'not' equal
		
		// 결과를 담을 땐 boolean (T/F)
		boolean result = n1<n2;
		System.out.println(result);
		
	}
}
