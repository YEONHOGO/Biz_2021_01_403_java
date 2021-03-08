package com.callor.score;

import java.util.Random;

public class Sort_02 {

	public static void main(String[] args) {
		
		int[] nums = new int[20];
		Random rnd = new Random();
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		System.out.println("정렬하기전 ==========");
		for(int n : nums) {
			System.out.print(n +",");
			if(++count % 5 == 0) 
				System.out.println();

		}
		System.out.println();

		
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = i + 1 ; j < nums.length; j++) {
				
				if(nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}// end if

			}// end for
		}// end for

		System.out.println("정렬한 후 ==========");
		for(int n : nums) {
			System.out.print(n +",");
			if(++count % 5 == 0) 
				System.out.println();
			
		}

		
	}// main end
}// class end
