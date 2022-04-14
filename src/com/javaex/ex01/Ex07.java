package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		double v01 = 5/4;
		System.out.println(v01);	//결과값 : 1.0 , double을 매겼는데? 이것도 후술 우선인가?
		
		/* double v01 = (int)5/4;에서 
	 	5/4가 1.25라는 값이 나오지만 정수타입이기때문에 소수값 0.25는 버려져서 1로 연산되고
	 	이 값을 v01이라는 double 변수에 넣어야 하니 결과적으로 1.0이 된게 아닌가 생각됩니다 _ 카톡 comment
		+
		자바에서는 기본적으로 정수연산은 int로 처리한다
		*/
		
		System.out.println(5/4);
		// 바로 출력하면 1이 나옴 (int)
		
		double v02 = (double)5/4;
		System.out.println(v02);	// 1.25
		
		double v03 = 5 / (double)4;
		System.out.println(v03);	// 1.25
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04);	// 1.25
		
		// 위 3가지 케이스는 default값이 int에서 연산과정에 double(실수)를 대입했기 때문에
		// 모든 연산이 큰 그릇인 double로 변환되었다고 추정
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);	// 2 -> 이건 int처리된 1.3과 1.8이 모두 소수점이 버려저서 1+1 = 2
		
	}
}
