package com.YEONHOGO.start.jdk;

import java.util.Random;

/*
 *  for( int i = 0; i < 100 ; i++)
 *  Random 클래스를 이용
 *  
 *  1 ~ 100까지 임의의 숫자 100을 만들고
 *  100개 중에 짝수가 있으면 짝수들의 합을 계산
 */
public class Random_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int intSum = 0;

		for (int i = 0; i < 100; i++) {

			int num = rnd.nextInt(100) + 1;
			boolean bYes = num % 2 == 0;

			if (bYes) {
				intSum += num;
				System.out.println(num);
			} // if end
		}	// for end

		System.out.println(intSum);

	}	// main end
}	// class end
