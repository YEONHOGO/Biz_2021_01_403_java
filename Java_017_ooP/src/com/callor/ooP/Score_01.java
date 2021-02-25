package com.callor.ooP;

import java.util.Scanner;
import com.callor.ooP.model.ScoreVO;

public class Score_01 {

	public static void main(String[] args) {
		
		ScoreVO sVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("학생의 정보를 입력하세요");
		System.out.println("---------------------------");
		
		while(true) { // [1]
		
		System.out.print("이름 >> ");
		sVO.strName = scan.nextLine();		
		
		// 국어
		while(true) { // [2]
				System.out.print("국어 >> ");
				String strKor = scan.nextLine();
				
			try {
				int intKor1 = Integer.valueOf(strKor);
				if(intKor1 < 50 || intKor1 > 100) {
					System.out.println("50 ~ 100점 까지만 입력가능");
				}else {
					// sVO.intKor = intKor1;
					sVO.setIntKor(strKor);
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("국어점수는 숫자로만 입력");
				continue;
			}
		}// while end [2]
		
		// 영어
		while(true) { // [3]
				System.out.print("영어 >> ");
				String strEng = scan.nextLine();
				
			try {
				int intEng1 = Integer.valueOf(strEng);
				if(intEng1 < 50 || intEng1 > 100) {
					System.out.println("50 ~ 100점 까지만 입력가능");
				}else {
					//sVO.intEng = intEng1;
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요(영어)");
				continue;
			}
		}// while end [3]
		
		// 수학
		while(true) { // [4]
				System.out.print("수학 >> ");
				String strMath = scan.nextLine();
				
			try {
				int intMath1 = Integer.valueOf(strMath);
				if(intMath1 < 50 || intMath1 > 100) {
					System.out.println("50 ~ 100점 까지만 입력가능");
				}else {
					sVO.intMath = intMath1;
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요(수학)");
				continue;
			}
		}// while end [4]
			
		}// while end [1]
	}// end main
}// end class
