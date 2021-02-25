package com.callor.ooP;

import java.util.Scanner;

import com.callor.ooP.model.ProductVO;

public class Product_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// VO 클래스를 배열로 선언하고
		// 사용(데이터 저장, 읽기) 하려면
		// 선언된 객체배열 요소요소를 모두
		// 다시 초기화(생성)하는 과정이 필요하다
		ProductVO[] pVO = new ProductVO[5];
		// 객체 배열 초기화
		// 이 과정이 생략되면
		// 이후 코드에서 NullPointerException이 발생한다
		for(int i = 0; i < pVO.length; i++) {
			pVO[i] = new ProductVO();
		}// end for
		
		System.out.println("=======================================");
		System.out.println("        나라쇼핑몰 상품관리 V1");
		System.out.println("=======================================");
		System.out.println("        상품 정보를 입력하시오.");
		System.out.println("---------------------------------------");

		String strN = 3 + ""; // "3" 이라는 문자열로 저장
		int intN = Integer.valueOf(strN);
		int sw = 0;
		for(int i = 0; i < pVO.length ; i++) {
			
			// 연속된 값으로 상품코드 생성
			String pCode = (i + 1) + "";
			System.out.println(pCode + "번 상품정보 입력");
			
			System.out.print("상품코드 >> ");
			pVO[i].strPCode = scan.nextLine();
			
			System.out.print("상품명 >> ");
			pVO[i].strPName = scan.nextLine();
	
			System.out.print("거래처 >> ");
			pVO[i].strDName = scan.nextLine();
	
			System.out.print("품목 >> ");
			pVO[i].strItem = scan.nextLine();
			
			// 매입단가가 0보다 작으면 다시 입력
			do {
				System.out.print("매입단가 >> ");
				String iPrice = scan.nextLine();
				pVO[i].iPrice = Integer.valueOf(iPrice);
				
				if(pVO[i].iPrice < 0) {
					System.out.println("다시 입력하세요(최소 : 0)");
				}
				
			}while(pVO[i].iPrice < 0);// do while end
			
			// 매출단가가 0보다 작으면 다시 입력
			do {
				System.out.print("매출단가 >> ");
				String oPrice = scan.nextLine();
				pVO[i].oPrice = Integer.valueOf(oPrice);
				
				if(pVO[i].oPrice < 0) {
					System.out.println("다시 입력하세요(최소 : 0)");
				}
				
			}while(pVO[i].oPrice < 0);// do while end
			
			
			pVO[i].toString();
		}// end for
		
	}// main end
}// class end
