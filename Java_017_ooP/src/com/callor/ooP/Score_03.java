package com.callor.ooP;

import java.util.Scanner;
import com.callor.ooP.model.ScoreVO;

public class Score_03 {

	public static void main(String[] args) {
		
		ScoreVO sVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("학생의 정보를 입력하세요");
		System.out.println("---------------------------");
		
		
		
		System.out.print("이름 >> ");
		sVO.strName = scan.nextLine();		
		
		// 국어
		while(true) { // [2]
				System.out.print("국어 >> ");
				String strKor = scan.nextLine();
				
				sVO.setIntKor(strKor);
				
				// intKor에 -1이 담겨있으면
				// 다시 입력을 하도록 해야한다.
				if(sVO.getIntKor() < 0) {
					System.out.println("국어점수 유효성 검사 실패");
					continue;
				}
				break;
			}
		
		
		// 영어
		while(true) { // [2]
				System.out.print("영어 >> ");
				String strEng = scan.nextLine();
				
				sVO.setIntEng(strEng);
				if(sVO.getIntEng() < 0) {
					System.out.println("영어 유효성 검사 실패");
					continue;
				}
			break;
		}// while end [2]
		
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
			
	
	}// end main
}// end class
