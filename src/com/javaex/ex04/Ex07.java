package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		// 별 찍기 Q2.
		// 이번에는 누적임
		
		for(int line = 1; line<=6; line++) {
			for(int i = 0; i!=line; i++) {
				char star = '*';
				System.out.print(star);
			}
			System.out.println();
		}
		
		// 규칙을 찾아서
		// y = 6번, x = y, y가 기준이 됨 (이거까지는 감 잡았음)
		// line = 0, i = 0으로 설정해서 한참을 삽질했음
		// 출력시 맨 앞줄이 떨어진 이유 (println적용 이유) : 
		// line 0이 line++로 아직0으로 적용되고 있는데, (반복 후에 1으로 up)
		// line 0 != i 0이라는 명제는 false이므로 별이 찍히지 않고 println만 처리됨
		// 그 다음줄부터 line이 1이되서 i!=line이 true가 되니 * 커맨드가 먹히게 되는 것
		
		/* for(int y=1; y<=6; y++){
		 *   for(int x=1; x<=y; x++){
		 *      System.out.print("*");
		 *   }
		 *   System.out.println();
		 * }
		 * 
		 * */
		
		
		
	}

}
