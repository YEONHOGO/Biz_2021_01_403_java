package com.callor.applications.service;

public class PrimeSerivceV1 {

	public void prime(int keyNum) {
		
		int pos = 0;
		for(pos = 2; pos < keyNum; pos++) {
			if(keyNum % pos == 0) {
				break;
			}
		}// for end
		if(pos < keyNum) {
			System.out.println(keyNum + "는 소수가 아닙니다");
		} else {
			System.out.println(keyNum + "는 소수입니다.");
		}
		
		
	}// prime end
}// class end
