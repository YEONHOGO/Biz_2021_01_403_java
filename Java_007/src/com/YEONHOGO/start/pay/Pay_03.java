package com.YEONHOGO.start.pay;
// 내 코드인데 고급코드라고한다 잘만든듯
public class Pay_03 {

	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;

		for (int i = 0 ; pay > 0; i++) {

			int count = (pay / paper);
			pay = pay - (paper * count);
			System.out.println(paper + "원권 : " + count);

			if ( i % 2 == 0) {	// i 가 짝수이면
				paper /= 5;
			} else	// 그렇지 않으면
			{
				paper /= 2;
			}
		}
		System.out.println("남은 금액 : " + pay);
	}
}
