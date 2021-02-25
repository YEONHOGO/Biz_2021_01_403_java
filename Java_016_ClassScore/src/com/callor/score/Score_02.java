package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		String[] strName = {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		int[] intKor = new int[strName.length];			// 국어
		int[] intEng = new int[strName.length];			// 영어
		int[] intMath = new int[strName.length];		// 수학
		int[] intSum = new int[strName.length];			// 총합
		float[] floatAvg = new float[strName.length];	// 평균
		
		// 난수, 성적에 삽입
		for(int i = 0; i < strName.length; i++) {// [1]
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}// end for [1]

		// 총점계산
		// ssV1.scoreSum() method를 호출하여 총점 계산
		for(int i = 0; i < strName.length; i++) {// [2]
			// ssV1.scoreSum() 호출
			// 총점을 계산하려면 3과목의 점수를 전달하고
			// 총점 결과를 다시 return 받아서 ... 해야한다
			
			// i번째 학생의 3과목 점수를
			// scoreSum() 전달하고
			// 결과를 다시 i번째 학생의 총점에 저장
			// intSum[i] : i번째 학생의 총점
			intSum[i] = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
		}// end for [2]
		
		// 평균
		for(int i = 0; i < strName.length; i++) {// [3]
			floatAvg[i] = ssV1.scoreAvg(intSum[i]);
		}// end for [3]
		
		// 출력		
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학\t총합\t평균");
		System.out.println("---------------------------------------------");
		for(int i = 0; i < strName.length; i++) {// [4]
			ssV1.scorePrint(strName[i],intKor[i],intEng[i],intMath[i],intSum[i],floatAvg[i]);
		}// end for [4]
		
		// 마무리
		System.out.println("=============================================");
		
		ssV1.print(strName,intKor,intEng,intMath,intSum,floatAvg);
		
		// 자작코드-----------------------------------------------------------------------------
		
		// 출력 나누기
		System.out.println();
		System.out.println("\t\t자작코드");
		
		// 난수 생성
		ssV1.scoreRandom();
		// 총점
		ssV1.scoreSum_1();
		// 평균
		ssV1.scoreAvg_1();
		// 출력
		ssV1.scorePrint_1();
		
		System.out.println();
		System.out.println("\t\t초간단코드");
		
		// 더욱 간단하게
		ssV1.simple();
		
		
	}// end main
}// end class
