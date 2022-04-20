package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		// random
		
		double num = Math.random();
		System.out.println(num);
		// 0~1사이 숫자들로만 랜덤생성 (더블형)
		
		
		// random함수 예제 (1~10)까지
		
		int sample = (int)(Math.random()*10)+1;
		System.out.println(sample);
		
		// 로또번호 생성해보기 (1~45) / my answer
		
		for(int i=1; i<=6; i++) {
			int lotto = (int)(Math.random()*45)+1;
			System.out.print(lotto + " ");
		}
		
		System.out.println();
		
		// 강사님 code
		int no1, no2, no3, no4, no5, no6;
		
		no1 = (int)(Math.random()*45)+1;
		no2 = (int)(Math.random()*45)+1;
		no3 = (int)(Math.random()*45)+1;
		no4 = (int)(Math.random()*45)+1;
		no5 = (int)(Math.random()*45)+1;
		no6 = (int)(Math.random()*45)+1;
		
		System.out.print(no1 + " ");
		System.out.print(no2 + " ");
		System.out.print(no3 + " ");
		System.out.print(no4 + " ");
		System.out.print(no5 + " ");
		System.out.print(no6 + " ");
		// 작성의도 => 반복적이라는걸 catch
		
		System.out.println("=================");
		
		for(int i=1; i<=6; i++) {
			System.out.println("no" + i);
		}
		// no + i(숫자)는 그저 문자형태로 표시해줄 뿐 데이터 관리가 안됨
		// '로또 당첨번호'라는 타이틀 아래 세트로 관리되기 위해서 '배열'이라는 장치가 필요
	}
}
