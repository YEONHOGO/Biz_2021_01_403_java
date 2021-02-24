package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_011 {

	/*
	 * 2 이상의 난수를 100 생성
	 * 임의 정수 10개중 소수인 수들의 리스트를 출력
	 * 소수인 수들의 합
	 */
	public static void main(String[] args) {
		
		/* 
		 * java에서는 변수, 객체를 선언할때
		 * 사용하기 직전에 선언 및 초기화를 하면 된다
		 * 통상적으로 코딩을 할때
		 * 변수, 객체등의 선언
		 * 가급적 코드의 시작부분(클래스 선언 명령문 아래, method 선언문 아래)에 작성한다
		 */
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		// int[] rndNums = new int[100];
		int rndNums[] = new int[100];
		
		// 생성된 rndNums 배열에 임의 정수 100개를
		// 저장해 두었다
		// 이처럼 배열을 만들어두면
		// 이후의 코드에서 한번 생성된 임의 정수 100개를
		// 자유롭게 활용할 수 있다.
		for(int i = 0; i < 100; i++) {
			rndNums[i] = rnd.nextInt(10000) + 2;
		}// for end
		
		// rndNums 배열에 담겨있는 정수들을
		// psV2.prime() method에 보내서
		// 소수인가 검사
		
		// 다음처럼 prime() method에 배열을 통째로 전다랗여
		// 코드를 수행할수 없는 이유
		// psV2.prime(rndNums);
		// psV2.prime() method는 매개변수 (int num)로
		// 선언되어 있다.
		// 즉 이 method는 전달받을 수 있는 값이 정수 1개이다
		// 그런데 이 배열(100개의 정수)를 한꺼번에 전달하려고
		// 시도하기 때문에 안된다.
		// 그렇다면 psV2.prime() method를 사용하기 위해서는
		// rndNums의 요소들을 한개씩 전달해야 한다.
		// 결론은 for() 반복문을 사용해야 한다.
		for(int i = 0; i < rndNums.length; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				System.out.print(num + ", ");
			}
		}// for end
		
		for(int i = 0; i < rndNums.length; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				intPrimeCount ++;
			}
		}// for end
		
		System.out.println();
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);
		
		
	}// main end
}// class end