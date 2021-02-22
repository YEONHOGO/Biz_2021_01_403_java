package com.callor.applications;

public class Numbers_02 {

	public static void main(String[] args) {
		
		int intNum1 = 33;
		int intNum2 = 77;
		int temp1 = 0;
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		// 1. (임시)로 사용할 temp를 만들고
		// 2. num1 변수값을 복사해 둔다(백업)
		//		33을 temp에 복사
		//		temp = 33;
		temp1 = intNum1;
		
		// 3. num1 변수에 num2의 값을 복사
		// num1 == num2 상태
		//		77을 num1에 복사
		//		num1 = 77
		intNum1 = intNum2;
		
		// 4. 임시로 (temp == 3) 에 백업해둔 num1의 값을
		// 		num1 == 77
		// 		temp == 33
		// num2에 복사
		// 		num2 == 33;
		intNum2 = temp1;
		
		// 5. num1과 num2의 값이 서로 바뀐다
		// 변수값의 swap 코드
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
	}// end main
}// end class
