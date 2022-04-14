package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String name = "김재환";
		
		
		String str01 = "굿모닝";
		
		System.out.println("안녕하세요");
		System.out.println(str01);
		//println : 출력 후 줄바꿈 (커서를 아래줄로 이동)
		
		System.out.print("안녕");
		System.out.println("하세요");
		//print : 줄바꿈을 하지 않음
		
		System.out.println(str01);
		System.out.println(str01 + str01); //굿모닝굿모닝
		// 문자열 +는 문자를 이어붙여서 출력함, +를 생략하면 오류 뜸 (변수인걸로 인식함)
		System.out.println(str01 + "안" + str01);
		
		System.out.println(str01 + i); //굿모닝 + 2345
		// 문자열 + int조합이어도 같이 문자열처럼 나열함
		
		String var01 = str01+i; // 문자 + 정수 2개 조합을 담기 위해 String 사용
		System.out.println(var01);
		//(변수 선언하지 않더라도 println에서 이미 문자형으로 자동형변환되어서 표현되는 것)
		
		System.out.println(str01 + "무야호" + i);
		System.out.println(str01 + " " + i);
		// 공백도 문자임
		
		System.out.println(str01 + d);
		
		System.out.println(i + i);
		System.out.println(i + d);
		// 문자열 없는 연산가능조합은 연산을 함
		
		// char(character)의 경우 (주의요망)
		System.out.println(c);
		System.out.println(c + c);	//????? 숫자 뭐야 -> 코드값으로 변환된 것
		System.out.println(c + i);
		
		System.out.println(s);
		System.out.println(s + s);
		System.out.println(s + i);
		
		System.out.println("제이름은"+ " " + name + " " + "입니다.");
		
		// 문자열 내부 명령어
		
		// 줄바꿈 명령어 : \n
		System.out.println("안녕\n하세요");
		
		// 탭 : \t
		System.out.println("안녕\t하세요");
		
		// 따옴표
		System.out.println("안녕\"하\"세요");
		
		// 역슬래쉬 (표기하고자 할 때 \\(2개))
		System.out.println("안녕\\하\\세요");
	}

}
