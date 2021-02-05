package com.YEONHOGO.start.loop;

public class Loop_01 {
	
	public static void main(String args[]) {
		
		for(int num = 0;num < 10; num +=1) {
			
			int num1 = (num + 1) * 100;
			System.out.println(num1);
		}
		System.out.println("==================================");
		/* 
		 * 보편적으로 for() 반복문을 사용하여 코딩을 할때
		 * int num = 0 : 시작값은 보통 0으로 초기화를 한다.
		 * num < 10 : 종료를 위한 비교연산은 등호를 가급적
		 * 		사용하지 않는다
		 * num == 1 : 증가값(변화값)
		 * 	 가급적 1씩 증가, 감소 하도록 코딩한다
		 * 
		 */
		for(int num = 0;num < 10; num += 1) {
			
			System.out.print(num + 1);
			System.out.println(".홍길동");
		}
		System.out.println("==================================");
		for(int num = 1; num <= 10; num += 1) {
			
			System.out.println(num+".홍길동");
		}
		System.out.println("==================================");
		for(int num = 0; num < 10; num += 1) {
			int num1 = num + 1;
			System.out.println(num1+".홍길동");
		}
		
	}

}
