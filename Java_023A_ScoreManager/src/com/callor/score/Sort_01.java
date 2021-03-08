package com.callor.score;

public class Sort_01 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 7;
		nums[1] = 2;
		nums[2] = 4;
		nums[3] = 3;
		nums[4] = 1;
		
		// 1 2 3 4 7
		System.out.println("정렬하기전 ==========");
		for(int n : nums) {
			System.out.print(n +",");
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
		}
	}// main end
}// class end
