package com.javaex.chapter01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// 자료형_실수형(float, double)
		
		double var01;	/* double var01 = 3.14; */
		float var02;  
		
		var01 = 3.14;
		var02 = 3.14F;	/* float도 정수형long처럼 실수 뒤에 F를 붙여줘야 적용 (무조건)*/
		
		System.out.println(var01);
		System.out.println(var02);
		
		//
		double var03;
		var03 = 0.1234567890123456789;
		
		float var04;
		var04 = 0.1234567890123456789F;
		
		System.out.println(var03);
		System.out.println(var04);
		
	}
}
