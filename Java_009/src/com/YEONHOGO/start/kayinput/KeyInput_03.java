package com.YEONHOGO.start.kayinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int num1 = rnd.nextInt(100) + 1;
		int keyNum = 0;
		System.out.println("\n난수\t" + num1);
		System.out.print("\n\t숫자입력 >> ");
		keyNum = scan.nextInt();
		
		// 1. keyNum < num1 이냐?
		//		맞으면 "큰값" 표시하고 종료
		if(num1 < keyNum) {
			System.out.println("입력한 숫자 '" + keyNum + "'은(는) 난수 '" + num1 + "' 보다 큽니다.");
			
		// 2. 그렇지 않으면 keyNum == num1 이냐?
		//		맞으면 "같다" 표시하고 종료
		} else if(num1 == keyNum) {
			System.out.println("입력한 숫자 '" + keyNum + "'은(는) 난수 '" + num1 + "' 와 같습니다.");
			
		// 3. 그렇지 않으면 keyNum > num1 이냐?
		//		맞으면 "작다" 표시하고 종료
		} else if(num1 > keyNum) {
			System.out.println("입력한 숫자 '" + keyNum + "'은(는) 난수 '" + num1 + "' 보다 작습니다.");
		}
		
		
	}// main end
}// class end
