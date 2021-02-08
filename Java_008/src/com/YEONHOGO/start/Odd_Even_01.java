package com.YEONHOGO.start;

public class Odd_Even_01 {

	public static void main(String args[]) {

		int intSum1 = 0;	// 자작 짝수 합
		int intSum2 = 0;	// 자작 홀수 합
		int intSum3 = 0;	// 수업 짝수 합
		int intSum4 = 0;	// 수업 홀수 합

		for (int i = 0; i < 100; i++) {

			if ((i + 1) % 2 == 0) {

				intSum1 += i + 1;

			}
			System.out.println(i + 1);
		}

		for (int i = 0; i < 100; i++) { // 1안 i 값을 처음부터 1로하고 조건문을 i < 101 로 바꾼다

			if ((i + 1) % 2 == 1) { 	// 2안 임프문에서 i + 1로 하여 그냥 for문에 반복되는 숫자가 0 ~ 99 인데 이걸 1 ~ 100 이 되게 하기

				intSum2 += i + 1;

			}

		}
		System.out.println("\t|===============================|");
		System.out.println("\t|\t짝수의 합 : " + intSum1 + "\t|");
		System.out.println("\t|\t홀수의 합 : " + intSum2 + "\t|");
		System.out.println("\t|===============================|");

		for (int i = 0; i < 100; i++) {

			boolean bYes = (i + 1) % 2 == 0;

			if (bYes) {

				// 값을 변수에 계속 더하라
				intSum3 += i + 1;

			}
		}

		for (int i = 0; i < 100; i++) {

			boolean bYes = (i + 1) % 2 == 1;

			if (bYes) {

				// 값을 변수에 계속 더하라
				intSum4 += i + 1;

			}
		}
		System.out.println();
		// 결과 값을 출력하라
		System.out.println("\t|===============================|");
		System.out.println("\t|\t짝수의 합 : " + intSum3 + "\t|");
		System.out.println("\t|\t홀수의 합 : " + intSum4 + "\t|");
		System.out.println("\t|===============================|");
	}
}
