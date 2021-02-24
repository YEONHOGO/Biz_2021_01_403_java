package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {

	public int scoreSum(int kor, int eng, int math, int art, int history) {
		int sum = kor;
		sum += eng;
		sum += math;
		sum += art;
		sum += history;
		
		return sum;
	}// end soreSum
	
	public int scoreSum(ScoreVO scoreVO) {
		int sum = scoreVO.intKor;
		sum += scoreVO.intEng;
		sum += scoreVO.intMath;
		sum += scoreVO.intMusic;
		sum += scoreVO.intHistory;
		return sum;
	}// end scoreSum
}// end class
