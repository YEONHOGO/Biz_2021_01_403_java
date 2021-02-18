package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {

	public static void main(String[] args) {
		
		ClassServiceV7 classServiceV7 = new ClassServiceV7();
		Scanner scan = new Scanner(System.in);
		int dan = 0;
		System.out.println("구구단을 계사하는 프로그램입니다.");
		while(true) {
			
			System.out.print("2부터 9까지의 숫자를 입력하시오 \n>> ");
			dan = scan.nextInt();
			if(dan < 2 || dan > 10) {
				System.out.println("\n잘못된 입력입니다.\n");
				continue;
			} else {
				break;
			}
			
		}// while end.
		classServiceV7.guGuDan(dan);
		
	}// main end
}// class end
