package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {
		
		String[] strName = new String[3];
		String strSubject = new String();
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < strName.length; i++) {
			int num = i + 1;
			System.out.print(num + "번째 학생의 이름 >> ");
			strName[i] = scan.nextLine();
			System.out.print("국어 >> ");
			
			// 문자열형으로 입력받고
			strSubject = scan.nextLine();
			// 문자열형숫자를 정수로 변경하여 저장
			intKor[i] = Integer.valueOf(strSubject);
			
			System.out.print("영어 >> ");
			strSubject = scan.nextLine();
			intEng[i] = Integer.valueOf(strSubject);
			
			System.out.print("수학 >> ");
			strSubject = scan.nextLine();
			intMath[i] = Integer.valueOf(strSubject);
		}// for end
		
		System.out.println("========================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------------------");
		for(int i = 0; i < strName.length; i++) {
			
			System.out.printf("%s\t%3d\t%3d\t%3d\n",strName[i],intKor[i],intEng[i],intMath[i]);
			
		}// for end
		System.out.println("========================================");
		
	}// main end
}// class end
