package com.YEONHOGO.applications;

import java.util.Scanner;

public class App_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자입력(2 ~ 9) >> ");
			int num1 = scan.nextInt();

			boolean bYes2 = num1 >= 2;
			boolean bYes9 = num1 <= 9;
			
			if (bYes2 && bYes9) {
				System.out.println("=========================");
				System.out.println("구구단 " + num1 + "단");
				System.out.println("-------------------------");
				
				for (int i = 0; i < 8; i++) {
					int num2 = i + 2;
					System.out.print(num1);
					System.out.print(" x ");
					System.out.print(num2);
					System.out.print(" = ");
					System.out.println(num1 * num2);
				} // 구구단 반복출력
				
				System.out.println("=========================\n");
				System.out.print("숫자입력(아무숫자 : 계속)(-1 : 종료) >> ");
				int num3 = scan.nextInt();
				if (num3 == -1) {
					System.out.println("\n종료");
					break;
				} else {
					continue;
				} // 계속 실행
			} else {
				System.out.println("입력한 숫자 : " + num1);
				System.out.println("값은 2 ~ 9까지만 입력하세요\n");
				continue;
			} // if end 잘못된 숫자 입력시 실행
		} // while end
	}// main end
}// class end
