package com.callor.applications;

import com.callor.applications.service.ScoreServiceV4;

public class Score_05 {

	public static void main(String[] args) {
		
		ScoreServiceV4 scV4 = new ScoreServiceV4();
		
		scV4.score(242, 80.666F);
		
		int intKor = 82;
		int intEng = 83;
		int intMath = 100;
		scV4.print(intKor, intEng, intMath);
		
	}// main end
}// class end
