package com.YEONHOGO.start.kayinput;

import java.util.Scanner;

public class KeyInput_01 {

	// 키보드에서 숫자 2개를 입력받고
	// 두 숫자의 덧셈을 계산
	public static void main(String[] args) {
		
		
		System.out.println();	// Console 출력문
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 >> ");
		int intNum1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력 >> ");
		int intNum2 = scan.nextInt();
		
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		
		add(intNum1, intNum2);
		System.out.println("======================");
		scanIn();
		
		
	} // main end
	
	public static void add(int num1, int num2) {
		
		int sum = 0;
		sum += num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
	}// add end
	
	public static void scanIn() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력 >> ");
		int intNum1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력 >> ");
		int intNum2 = scan.nextInt();

		add(intNum1, intNum2);
		
	}// scan end
} // class end

