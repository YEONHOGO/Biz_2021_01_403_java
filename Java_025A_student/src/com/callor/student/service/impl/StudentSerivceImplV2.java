package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.values.Values;

public class StudentSerivceImplV2 extends StudentServiceImplV1{

	
	/*
	 * StudentServiceImplV1을 상속받아서
	 * serchStudent() 만 다시 정의하여 구현하겠다.
	 */
	
	@Override
	public void SerchStudent() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력");
			System.out.println(Values.sLine(50));
			System.out.print("이름>> ");
			String strName = scan.nextLine();
			
			if(strName.equals("QUIT"))
				break;
			
			boolean bYesSearch = false;
			for(StudentVO sVO : stdList) {
				if(strName.equals(sVO.getStName())) {
					bYesSearch = true;
					this.printStVO(sVO); // 출력하고
					break;				 // 중단하고
				}
			}// end for
			
			// 못찾았으면..
			if(!bYesSearch) {
				System.out.println(strName + "학생은 없음");
			}
			
			
		}// end while
		
		scan.close();
	}// method end
	
}// class end
