package com.YEONHOGO.start.pay;

public class Pay_01 {

	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;

		// for() 반복문이 무한 반복된다.
		// for() 문을 종료하는 조건을 부여해야 한다
		int sw = -1;
		for (; pay > 0;) { // 0 < pay 이것도 됨 또는 99 < paper 또는 100 <= paper

			int count = (pay / paper); // 화폐 권의 갯수(몫)
			pay = pay - (paper * count); // 남은 금액
			System.out.println(paper + "원권 : " + count);

			if (sw < 0) { 
				paper /= 5;
			}
			if (sw > 0) {
				paper /= 2;
			}

			// 최초의 sw가 -1이다가
			// 두번째 for() 반복문을 시작하기전에
			// -1을 곱하여 sw를 1로 만든다
			sw *= (-1);
		}
		System.out.println("남은 금액 : " + pay);
	}
}
