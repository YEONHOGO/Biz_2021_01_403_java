package com.callor.ooP;

import java.util.Scanner;

import com.callor.ooP.model.ProductVO;

public class Product_03_1 {

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
			
			while(true) {
				System.out.print("매입단가 >> ");
				String strIPrice = scan.nextLine();
				int intIPrice = Integer.valueOf(strIPrice);
				if(intIPrice < 0) {
					System.out.println("매입단가는 0이상 입력하세요");
				}else {
				pVO[i].iPrice = intIPrice;
				break;
				}
			}// while end
			
			while(true) {
				System.out.print("매출단가 >> ");
				String strOPrice = scan.nextLine();
				int intOPrice = Integer.valueOf(strOPrice);
				if(intOPrice < 0) {
					System.out.println("매출단가는 0이상 입력하세요");
				}else {
				pVO[i].iPrice = intOPrice;
				break;
				}
			}// while end

			
			pVO[i].toString();
		}// end for
		
	}// main end
}// class end
