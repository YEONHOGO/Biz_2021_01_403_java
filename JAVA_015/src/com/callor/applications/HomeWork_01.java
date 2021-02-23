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
		
		int[] intNums = new int[100];
		int intSum = 0;
		
		// 난수 생성 및 저장
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt();
		}// for end
		
		// 난수 비교 후 출력 문
		for(int i = 0; i < intNums.length; i++) {
			
			int result = psV2.prime(intNums[i]);
			
			if(result == -1) {
				continue;
			} else {
				System.out.printf("소수 %d\n", intNums[i]);
			}
			
		}// for end
		
		// 난수의 합계산
		for(int i = 0; i < intNums.length; i++) {
			int result = psV2.prime(intNums[i]);
			
			if(result == -1) {
				continue;
			} else {
				intSum += intNums[i];
			}
			
		}// for end
		// 난수의 합출력
		System.out.printf("난수의 합 : %d\n",intSum);
	}// main end
}// class end
