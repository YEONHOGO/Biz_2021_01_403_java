package com.YEONHOGO.start;

public class Multiple_01 {

	public static void main(String[] args) {

		int intSum = 0;

		for (int i = 0; i < 100; i++) {

			int num = i + 1;

			boolean bYes3 = num % 3 == 0;
			boolean bYes9 = num % 9 == 0;

			if (bYes3 && bYes9) {

				intSum += num;

			}

		}

		System.out.println();
		System.out.println("\t|=======================================================|");
		System.out.println("\t|\t3의 배수이면서 9의 배수인 수들의 합 : " + intSum + "\t|");
		System.out.println("\t|=======================================================|");
		System.out.println("====================================================");
		
		intSum = 0;
		
		for( int i = 0; i < 100; i++) {
			
			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;
			
			// if() 비교연산문을 중복 처리하는 방식
			if(bYes3M) { // 3의 배수를 검사하고 맞으면
				if(bYes9M) { // 다시 9의 배수를 검사
					intSum += num1;
					System.out.println(num1);
					
				}
			}

			
		}
		
		System.out.println(intSum);

	}

}
