package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// 형 변환 -> 자료형 변경 & 통일 (각기 다른 자료형을 연산하기 위하여)
		System.out.println(2+5); // (int 2 + int 5)
		
		// 자동형변환 : 좁은자료형 -> 넓은자료형으로
		double var01 = 2+3.5;
		// 범위 : 정수(int) < 실수(double), 결국 2.0 + 3.5로 처리하여 연산함
		System.out.println(var01);
		
		long var02 = 12345L;
		float var03 = 1.1F;
		System.out.println(var02+var03);
		
		float result = var02+var03;
		// float에는 담을 수 있으나 long으로 담으려하면 에러남 (범위 issue)
		// var02(long 12345L;) -> var02(float 12345.0F;)로 변환
		System.out.println(result);
		
		// 형변환 규칙 : byte(1) < short(char)(2) < int(4) < long(8) < float(4) < double(8)
		// ()숫자는 byte 용량 숫자
		// char 지원(기본자료형, short와 같은 level)
		
		// 강제형변환 : 프로그래머의 의사표시로 자료형을 강제적으로 변환시키는 것
		float var04 = 111.2345F;
		int var05 = (int)var04; // ()안에 강제로 변환하고자 할 자료형 의사표시
		System.out.println(var05);
		
		// 강제형변환의 문제점 : 축소변환 시 자료소실 가능성이 있음 (작은 그릇에 큰걸 담으려 하니 넘치지)
		//					확대변환이야 뭐 문제 있겠나
		
		
		// 비정상 축소변환 case
		int var06 = 1000000;
		byte var07 = (byte)var06;
		System.out.println(var07);
		//var06 = 1000000;의 값이 var07 byte로 강제집행했더니 64로 왜곡된 결과값이 나옴
		
		
		// 정상 축소변환 case (원본값이 변환하고자 하는 자료형의 수용범위 이내일 경우)
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);
		// 축소변환을 했다고 해서 원본인 v01이 망가지지는 않음
		
		
		// 확대변환(byte -> int)
		byte v03 = 100;
		int v04 = (int)v03;
		//int v04 = v03;으로 작성해도 오류가 나지는 않는데, int>byte라서 수용가능하므로 자동형변환 처리된 case
		//헷갈리니까 자동형변환 믿지말고 (int) 써주는게 통일성 부분에서 독해하기 편할 듯
		System.out.println(v04);
		
		//실수 -> 정수로 변환
		double v05 = 5.57;
		int v06 = (int)v05;
		System.out.println(v06);
		
		//정수 -> 실수로 변환
		int v07 = 7;
		double v08 = (double)v07;
		System.out.println(v08);
		
		
		
	}
}
