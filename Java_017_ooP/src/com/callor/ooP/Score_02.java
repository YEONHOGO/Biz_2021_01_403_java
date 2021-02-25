package com.callor.ooP;

import java.util.Scanner;

import com.callor.ooP.model.ScoreVO;
import com.callor.ooP.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("학생의 정보를 입력하세요");
		System.out.println("---------------------------");
		
		System.out.print("이름 >> ");
		scoreVO.strName = scan.nextLine();		
		
		scoreVO.setIntKor("국어" + "");
		scoreVO.setIntEng("영어" + "");
		//scoreVO.intMath = ssV1.inputScore("수학");
		

	}// end main
}// end class
