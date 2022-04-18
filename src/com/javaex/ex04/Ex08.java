package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		int i=1;
		
		while(true){
			
			if(i%6==0 && i%14==0) {
				// if문이 true일 때
				System.out.println(i);
				break;
			}
			i++; //else를 굳이 쓰지않더라도 충돌할 일이 없음(특수한 경우임)
			
			
		}
	}

}
