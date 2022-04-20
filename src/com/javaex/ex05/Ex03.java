package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		//로또 번호 배열응용
		
		int[] lottonums = new int[6];
		
		lottonums[0] = (int)(Math.random()*45)+1;
		lottonums[1] = (int)(Math.random()*45)+1;
		lottonums[2] = (int)(Math.random()*45)+1;
		lottonums[3] = (int)(Math.random()*45)+1;
		lottonums[4] = (int)(Math.random()*45)+1;
		lottonums[5] = (int)(Math.random()*45)+1;
		
		System.out.println(lottonums[0]);
		System.out.println(lottonums[4]);
		//이것 또한 반복작업
		System.out.println("========================");
		
		//반복문으로 축약 (모든 방에 공통된 규칙이라 for문이 사용가능했음_특수 case임)
		for(int i = 0; i<6; i++) {
			lottonums[i] = (int)(Math.random()*45)+1;
			System.out.print(lottonums[i] + " ");
		}
		
		// 반복문과 같이 한문장으로 표현하고자 할때, 배열의 '방 개수'가 변동될 수 있음
		// ex)로또 번호와 같이 6개로 정해져 있지 않고 수정이 이루어지면 그때마다 숫자를 바꾸기 번거로움
		// 따라서 lottonums(배열명).(length) 문법을 통해 표현 가능
		// for(int i = 0; i<lottonums.length;<i++)로 변경 가능
	}

}
