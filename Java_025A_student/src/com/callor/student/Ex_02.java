package com.callor.student;

import java.util.Random;

public class Ex_02 {

	public static void main(String args[]) {
		
		/*
		 * Random 클래스를 사용하여 1 ~ 100까지 범위의
		 * 임의의 정수를 생성하여
		 * 이 정수가 짝수인지 홀수인지 판별
		 */
		
		Random rnd = new Random();
		
		int num1 = rnd.nextInt(100) + 1;
		
		if(num1 % 2 == 0) {
			System.out.println(num1 + "는 짝수");
		} else {
			System.out.println(num1 + "는 홀수");
		}
		
	}// main end
}// class end
