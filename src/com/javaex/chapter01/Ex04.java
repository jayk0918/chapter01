package com.javaex.chapter01;

public class Ex04 {

	public static void main(String args[]) {
		
		char ch01 = 'A'; // char = 항상 ''(작은따옴표)로 표기
		char ch02 = '안';
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		char ch03 = 65;
		// 65라는 숫자를 char의 코드표에 있는 숫자로 직접적으로 인식하여 'A'라는 문자값을 출력해줌
		System.out.println(ch03);
		
		char ch04 = '3'; // 숫자 3을 숫자(정수)가 아닌 글자로 처리하고자 할 때 '' 사용
		System.out.println(ch04);
		
		// 문자를 처리할 때는 주로 String(대문자 유의) + ""(큰 따옴표) 사용 -> 기본자료형 소속 X
		String str01 = "안녕하세요";
		System.out.println(str01);
		
		// 연습문제 : 변수&자료형 결정하기
		
		/*
		(String) number;		//학번
		(String) name;			//이름
		(boolean) isEnrolled;	//등록 여부
		(float)	gradeF;			//평점
		(double은 굳이?)
		(String) address;		//주소
		(String) major;			//전공
		(int) unit;				//이수 학점
		(short도 통상 130~140학점인걸 감안하면 가능은 할텐데 굳이?)				
		(boolean) haveMinor;	//부전공 여부
		(String) juminNo;		//주민번호(-없이 13자리숫자) 
		(String) cellphone;		//핸드폰 번호(-포함한 숫자)
		(int) age;				//나이
		(String) email;			//이메일주소
		*/
		
	}
}
