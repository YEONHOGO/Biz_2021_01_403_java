package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {
		// 1. HomeWork_01 의 main() method에서
		// 2. Random 클래스를 사용하여 임의의 정수 100개를 만들고 ㅇ
		// 3. PrimeServiceV2의 prime() 메서드를 호출하여
		// 4. 임의의 정수 100개 중 소수인 수들의 리스트 출력
		// 5. 소수인 수들의 합을 계산하여 출력
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		Random rnd = new Random();
		
		int[] rndNums = new int[10]; // 100개의 난수가 들어갈 배열
		final int rndMax = 100; // 난수의 최대치
		int rndSum = 0; // 난수중에 소수인 값들의 합
		
		// 난수 생성 및 저장
		for(int i = 0; i < rndNums.length; i++) {
			rndNums[i] = rnd.nextInt(rndMax) + 2;
		}// for end
		
		// 난수 비교 후 출력 문
		for(int i = 0; i < rndNums.length; i++) {
			
			int result = psV2.prime(rndNums[i]);
			
			if(result > 0) {
				System.out.printf("소수 %d\n", rndNums[i]);
			}// if end
			
		}// for end
		
		// 난수의 합계산
		for(int i = 0; i < rndNums.length; i++) {
			int result = psV2.prime(rndNums[i]);
			
			if(result > 0) {
				rndSum += rndNums[i];
			}// if end
			
		}// for end
		
		// 난수의 합출력
		System.out.printf("난수의 합 : %d\n",rndSum);
	}// main end
}// class end
