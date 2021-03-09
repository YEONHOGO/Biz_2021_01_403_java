package com.callor.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여
 * 10 ~ 100 까지 임의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수중에 소수들만 찾아서
 * Console 출력
 */

public class Ex_08 {
	
	public static void main(String[] args) {
	
		Random rnd = new Random();
		int[] nums = new int[100];
		boolean bYes = true;
		
		
		for(int i = 0 ; i < 100 ; i++) {
			nums[i] = rnd.nextInt(90) + 11;
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			
			for(int j = 2; j < nums[i] ; j++) {
				if(nums[i] % j == 0) {
					bYes = false;
					break;
				}
				
				
				
				
			}// end for
			if(bYes) {
				System.out.println(nums[i]);
			}
			
		}// end for
		

		
		
		
		
	}// main end
}// class end
