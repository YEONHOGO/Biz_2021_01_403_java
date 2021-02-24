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
		
		int[] intRndNums = new int[100]; // 100개의 난수가 들어갈 배열
		final int intRndMax = 100; // 난수의 최대치
		int intRndSum = 0; // 난수중에 소수인 값들의 합
		int intPrimeCount = 0;
		
		// 난수 생성 및 저장
		// 0부터 99까지의 난수를 생성
		// 생성된 난수에 2를 더한다.
		// 최종 생성된 난수는 2 ~ 101 이다.
		for(int i = 0; i < intRndNums.length; i++) {
			intRndNums[i] = rnd.nextInt(intRndMax) + 2;
		}// for end
		
		// 제목 출력
		System.out.println("============================");
		System.out.println("\t소수 리스트");
		System.out.println("----------------------------");
		
		// 난수 비교 후 출력 문
				// rndNums에 들어있는 수가 소수이면
				// 그대로 반환한다.
				// 그러나 소수가 아닌경우에는 -1을 반환한다.
		for(int i = 0; i < intRndNums.length; i++) {
			
			int result = psV2.prime(intRndNums[i]);
			
			if(result > 0) {
				System.out.printf("소수 %d\n", intRndNums[i]);
			}// if end
			
		}// for end
		System.out.println("============================");
		
		// 소수의 합계산 및 소수의 개수 세기
		for(int i = 0; i < intRndNums.length; i++) {
			int result = psV2.prime(intRndNums[i]);
			//소수 개수 세기
			if(result > 0) {
				intRndSum += intRndNums[i];
				intPrimeCount++;
			}// if end
			
		}// for end
		
		// 소수의 합 및 난수의 갯수 출력
		System.out.printf("난수의 합 : %d\n",intRndSum);
		System.out.printf("난수의 개수 : %d\n",intPrimeCount);
		System.out.println("============================");
	}// main end
}// class end
