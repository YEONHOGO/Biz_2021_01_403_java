package com.callor.applications;

import java.util.Random;

public class Prime_04 {
	
/*
 *  배열없이 단순하게 난수를 생성하고
 *  소수인지 판별하여 출력하기
 *  중복(이증) 반복 문
 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		for(int i = 0; i < 10; i++) { // 1
			int rndNum = rnd.nextInt(1000) + 2;
			
			// 생성된 난수(rndNum)값이 소수인지 검사
			int index = 0;
			for(index = 2; index < rndNum; index++) { // 2
				
				if(rndNum % index == 0) {
					break;
				}// if end
			}// for[2] end
			if(index < rndNum) {
				System.out.println(rndNum + "는 소수 아님");
			} else {
				System.out.println(rndNum + "는 소수");
				intPrimeSum += rndNum;
				intPrimeCount++;
			}
		}// for[1] end
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);
	}// end main
}// end class
