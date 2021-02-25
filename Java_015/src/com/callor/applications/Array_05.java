package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intNums = new int[100];
		int intSum = 0;
		
		// 난수 생성, 대입
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}// for end
		
		// 3의 배수이면서 5의 배수인 값 출력
		for(int i = 0; i < intNums.length; i++) {
			boolean bYes = (intNums[i] % 3) == 0 && (intNums[i] % 5) == 0;
			if(bYes) {
				System.out.println(intNums[i]);
			}// if end
		}// for end
		
		// 3의 배수이면서 5의 배수인 값 합계 구하기
		for(int i = 0; i < intNums.length; i++) {
			boolean bYes = (intNums[i] % 3) == 0 && (intNums[i] % 5) == 0;
			if(bYes) {
				intSum += intNums[i];
			}// if end	
		}// for end
		
		// 3의 배수이면서 5의 배수인 값의 합계 출력
		System.out.printf("3의 배수이면서 5의 배수인 값들의 합계 : %d\n",intSum);
		
	}// end main
}// end class
