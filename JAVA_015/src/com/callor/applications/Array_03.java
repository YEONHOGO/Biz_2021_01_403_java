package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] intNums = new int[100];
		int keyNum = 0;

		
		
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}// for end
		
		System.out.println("1 ~ 10 내에서 정수 1개를 입력하시오");
		System.out.print("입력 >> ");
		String strSubj = scan.nextLine();
		keyNum = Integer.valueOf(strSubj);
		
		for(int i = 0; i < intNums.length; i++) {
			
			if(keyNum == intNums[i]) {
				System.out.printf("최초의 %d의 위치는 : intNums[%d]\n",keyNum,i);
				break;
			}// if end
		}// for end
		
	}// end main
}// end class
