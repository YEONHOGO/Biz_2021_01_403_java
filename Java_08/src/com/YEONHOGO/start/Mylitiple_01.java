package com.YEONHOGO.start;

public class Mylitiple_01 {

	public static void main(String[] args) {
		
	
		int intSum1 = 0;

		// 0 부터 99까지 - > 7 부터 106까지
		for (int i = 0; i < 100; i++) {

			int num1 = i + 7;
			boolean bYes = (num1) % 3 == 0;

			if (bYes) {

				intSum1 += num1;
				System.out.println(num1);

			}

		}

		System.out.println();
		System.out.println("\t|===============================|");
		System.out.println("\t|\t3의 배수 합 : " + intSum1 + "\t|");
		System.out.println("\t|===============================|");

		// 위에서 선언하고 사용했던 변수를 "재 사용" 하기
		// 반드시 초기화(clear) 해야 한다.
		intSum1 = 0;
		for (int i = 0; i < 100; i++) {

			int num = i + 1;
			boolean bYes = num % 2 == 0;

			// if(bYes == false) {
			// bYes 가 아니면
			if (!bYes) {

				intSum1 += num;

			}
			
		}
		
	}
}

