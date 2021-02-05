package com.YEONHOGO.start.pay;

public class Pay_02 {

	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;

		int sw = -1;
		for (; pay > 0;) {

			int count = (pay / paper);
			pay = pay - (paper * count);
			System.out.println(paper + "원권 : " + count);

			if (sw < 0) {	// sw가 0보다 작으면
				paper /= 5;
			} else	// 그렇지 않으면
			{
				paper /= 2;
			}
			sw *= (-1);
		}
		System.out.println("남은 금액 : " + pay);
	}
}
