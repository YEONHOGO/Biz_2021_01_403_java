package com.callor.applications;

import java.util.Scanner;

public class Score_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		String strSubj = new String();
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		for(int i = 0; i < strName.length; i++) {
			
			System.out.printf("%s의 점수를 입력하세요\n",strName[i]);
			System.out.print("국어 >> ");
			strSubj = scan.nextLine();
			intKor[i] = Integer.valueOf(strSubj);
			
			System.out.print("영어 >> ");
			strSubj = scan.nextLine();
			intEng[i] = Integer.valueOf(strSubj);
			
			System.out.print("수학 >> ");
			strSubj = scan.nextLine();
			intMath[i] = Integer.valueOf(strSubj);
		}// for end
		
		System.out.println("=================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------------");
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}// for end
		System.out.println("=================================");
	}// main end
}// class end
