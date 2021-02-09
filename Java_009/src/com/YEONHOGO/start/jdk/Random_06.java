package com.YEONHOGO.start.jdk;

import java.util.Random;

/*
 * Copy & Understand, past
 * 복사 붙이기( ^C, ^V )
 */
public class Random_06 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int count = 0;
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;
			count++;
			boolean bYes = num > 34;
			if (bYes) {
				System.out.println(count + "번째의 숫자 '" + num + "'는 34보다 큰값입니다.");
				break;	// for 이탈
				// ... 절대 실행되지 않는다.
			} // if end
			if (i == 99) {
				System.out.println();
				System.out.println("34보다 큰값이 생성되지 않았습니다.");
			} // if end
		} // for end
		
		int intEnd = 100;
		count = 0;
		for( ; count <= intEnd ; count++ ) {
			
			int num = rnd.nextInt(100) + 1;
			if(num > 50) {
				break;
			}
		} // for end
		System.out.println(count);
		// for 밖에서 count를 선언시 count 변수값을 for 밖에서 읽을 수 있다.
		// 만약 for() 반복문이 중단되지 않고
		// 모두 정상적으로 수행되고나면
		// count와 intEnd는 count == intEnd 가 된다
		if(intEnd > count) {
			// for()가 어떤 이유로 중간에 break 되었다
			System.out.println("for 중단");
			System.out.println((count+1) + "번째에서 값 발견");
		} else {
			System.out.println("for 모두 반복 수행 완료");
			System.out.println("값을 찾을수 없음");
		}
		
		// 의미 없는 코드
		if(intEnd <= count) {
			// for()가 정상 종료되었다
			System.out.println("정상종료");
		}
		
	} // main end
} // class end
