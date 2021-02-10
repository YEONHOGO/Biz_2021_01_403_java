package com.YEONHOGO.applications;

import java.util.Scanner;

public class App_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력(2 ~ 9) >> ");
		int num = scan.nextInt();
		int i = 0;
		
		do{

			boolean bYes = num > 1 && num < 10;
			int num1 = i + 2;
			if (!bYes) {
				System.out.println("2 ~ 9 의 값이 아닙니다.");
				i = 8;
				continue;
			} else if (num1 == 2) {
				System.out.println("=======================");
				System.out.println("\t구구단 " + num + "단");
				System.out.println("-----------------------");
			} 
			System.out.println( "\t" + num + " x " + num1 + " = " + (num * num1) );
			
			if( i == 7) {
				System.out.println("=======================");
			}
			i++;
		}while(i < 8);
	

	} 
} 
