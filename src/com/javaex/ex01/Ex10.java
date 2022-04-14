package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// 논리연산자 (and&& / or|| / not!)
		// &&(and) : 비교대상인 두 값이 모두 True이어야 True, 나머지는 False (엄격)
		// ||(or) : 비교대상인 두 값 중 하나만 True여도 True, 둘 다 False이면 False (느슨)
		// 연산을 요구하는 식이 많더라도, 결국은 1대1비교로 연산됨 (한꺼번에 연산 불가능)
		// ex) (T&&T)&&F -> (T)&&F -> False
		
		int a = 5;
		int b = 7;
		
		System.out.println("&&연산자");
		System.out.println(true&&true);
		System.out.println(true&&false);
		//System.out.println(false&&true); // 노란색 오류(dead code) 출력이유 : 이미 계산 끝났는데 보나마나 = (false)
		//System.out.println(false&&false);
		
		System.out.println("||연산자");
		//System.out.println(true||true);	// 노란색 오류(dead code) 출력이유 : 이미 계산 끝났는데 보나마나 = (true)
		//System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("응용");
		System.out.println("-----&&-----");
		System.out.println((a>b)&&(a<b)); //(false)&&(true) -> false
		System.out.println((a>b)&&(a>b)); //(false)&&(false) -> false
		System.out.println("-----||-----");
		System.out.println((a>b)||(a<b)); //(false)||(true) -> true
		System.out.println((a>b)||(a>b)); //(false)||(false) -> false
		// 변수로 계산을 할 때는 말 그대로 '변수'기 때문에 확정된 결론을 지을 수 없으므로 오류가 출력되지 않음
		// 위에 true, false는 확정값이니까 저렇게 오류 처리한 것
		
		
		//!(not)
		System.out.println("----------");
		System.out.println(a!=b);
		System.out.println(!(a>b)); // !(not) + (false) = true
		System.out.println(!(a<b)); // !(not) + (true) = false
		
		//연산자 우선순위 예제
		
		/*1) result = x * y % z - a / b
					*_1, %_2, /_3, -_4 =_5
		
		2) m = x + y + z / 3
				/_1, +(left)_2, +(right)_3, =_4
		
		3) result = x % y * z
				%_1, *_2, =_3
		
		4) x=y=w=z; (오른쪽에서 왼쪽으로)-> 뭔말이여
			
			x=(y=(w=(z))); = 이 얘긴가?
		
		
		5) x = y = 3 / 5 * 2 % 6;
			/_1, *_2, %_3, =(right)_4, =(left)_5
		
		6) y = a * x * x + b * x + c;
			*(first)_1, *(second)_2, *(third)_3, +(left)_4, +(right)_5, =_6
		
		*/
		
	}
}
