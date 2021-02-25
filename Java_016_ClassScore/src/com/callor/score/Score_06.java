package com.callor.score;

import java.util.Random;

import com.callor.score.model.ScoreVO;

public class Score_06 {

	public static void main(String[] args) {
		
		ScoreVO[] scoreVO = new ScoreVO[10];
		for(int i = 0; i < scoreVO.length; i++) {
			scoreVO[i] = new ScoreVO();
		}// end for
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < scoreVO.length; i++) {
			scoreVO[i].intKor = rnd.nextInt(100) +1 ;
			scoreVO[i].intEng = rnd.nextInt(100) +1 ;
			scoreVO[i].intMath = rnd.nextInt(100) +1 ;
			
		}// end for
		
		System.out.println("=====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		for(int i = 0; i < scoreVO.length ; i++) {
			
			int sum = scoreVO[i].intKor;
			sum += scoreVO[i].intEng;
			sum += scoreVO[i].intMath;
			
			float floatAvg = (float)sum / 3;
			
			System.out.printf("%3d\t%3d\t%3d\t%3d\t%3.2f\n",
					scoreVO[i].intKor,
					scoreVO[i].intEng,
					scoreVO[i].intMath,
					sum,floatAvg);
		}// end for
		System.out.println("=====================================");
	}// end main
}// end class
