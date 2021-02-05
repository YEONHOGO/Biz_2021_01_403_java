package com.YEONHOGO.start.loop;

public class While_02 {
	
	public static void main(String args[]) {
		
		int count = 0;
		
		while(++count < 10) {
			
			System.out.println(count);
			
		}
		
		System.out.println("====================================");
		System.out.println(count);
		System.out.println("====================================");
		count = 0;
		
		while(count < 10) {
			
			System.out.println(++count);
		}
		
		// 1
		System.out.println(count++);
		// 풀어쓰면
		System.out.println(count);
		count += 1;
		
		//2
		System.out.println(++count);
		//풀어쓰면
		count++;
		System.out.println(count);
		
		//int i =0
		for(int i = 0; i < 10; i++) {
			
			
		}
		// int i = 100;
	}

}
