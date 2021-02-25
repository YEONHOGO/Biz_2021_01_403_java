package com.callor.applications.service;

public class PrimeServiceV2 {
	
	// keyNum 값이 소수이면 return keyNum
	// 아니면 return -1;

	public int prime(int keyNum) {
		
		int pos = 0;
		for(pos = 2; pos < keyNum; pos++) {
			// true 이면 소수가 아니다
			if(keyNum % pos == 0) {
				// prime() method 실행을 중단하고
				// main() method 에게 -1을 되돌려줘라
				return -1;
			}// if end
		}// for end
		// keyNum값이 소수이어서 for() 반복문을 모두 수행하고
		// 여기에 다다르면 keyNum 값을 그대로 return 하라
			return keyNum;
	}// keyNum end
}// class end
