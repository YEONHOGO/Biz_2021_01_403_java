package com.YEONHOGO.start;

public class Muliple_02 {

	public static void main(String[] args) {

		int intSum = 0;

		for (int i = 0; i < 100; i++) {

			int num = 0;
			num = i + 7;
			boolean bYes = num % 3 == 0;

			if (!bYes) {

				intSum += num;
			}

		}

		System.out.println();
		System.out.println("\t|==========================================|");
		System.out.println("\t|\t3의 배수가 아닌 수의 합 : " + intSum + "\t   |");
		System.out.println("\t|==========================================|");

		intSum = 0;

		for (int i = 0; i < 100; i++) {

			int num = i + 7;
			boolean bYes = num % 3 == 1;

			if (bYes) {

				intSum += num;
			}

			boolean bYes2 = num % 3 == 2;
			if (bYes2) {
				intSum += num;
			}

		}

		System.out.println();
		System.out.println("\t|==========================================|");
		System.out.println("\t|\t3의 배수가 아닌 수의 합 : " + intSum + "\t   |");
		System.out.println("\t|==========================================|");

		intSum = 0;
		for (int i = 0; i < 100; i++) {

			int num = i + 7;
			boolean bYes = num % 3 > 0;

			if (bYes) {

				intSum += num;
			}

		}

		System.out.println();
		System.out.println("\t|==========================================|");
		System.out.println("\t|\t3의 배수가 아닌 수의 합 : " + intSum + "\t   |");
		System.out.println("\t|==========================================|");
		
		intSum = 0;
		for (int i = 0; i < 100; i++) {

			int num = i + 7;
			boolean bYes = num % 3 != 0;

			if (bYes) {

				intSum += num;
			}

		}

		System.out.println();
		System.out.println("\t|==========================================|");
		System.out.println("\t|\t3의 배수가 아닌 수의 합 : " + intSum + "\t   |");
		System.out.println("\t|==========================================|");
	}
}
