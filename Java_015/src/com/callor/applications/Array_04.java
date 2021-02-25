package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		
		int[] intNums = new int[100];
		int count = 0;
		int keyNum = 0;
		
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}// for end
		
		System.out.println("1 ~ 10 내의 정수를 입력하시오");
		System.out.print("입력 >> ");
		String strSubj = scan.nextLine();
		keyNum = Integer.valueOf(strSubj);
		
		/*
		 * 변수는 앞에서 어떤 값을 저장했던 상관없이
		 * 가장 마지막에 저장한 값만 가지고 있다
		 */
		
		for(int i = 0; i < intNums.length; i++) {
			
			if(keyNum == intNums[i]) {
				//키보드에 입력한 값이 일치할때마다
				// 그위치를 count 저장한다
				count = i;
			}// if end
		}// for end
		// 여기 오면 count 에 저장된 값은 
		// 가장 마지막으로 if문이 실행될때의 i 값이다
		System.out.printf("마지막 keyNum값 %d의 위치는 intNums[%d]\n",keyNum,count);
	}// end main
}// end class
