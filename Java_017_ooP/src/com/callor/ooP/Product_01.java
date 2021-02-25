package com.callor.ooP;

import java.util.Scanner;
import com.callor.ooP.model.ProductVO;

public class Product_01 {

	public static void main(String[] args) {
		
		ProductVO pVO = new ProductVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("toString() : " + pVO.toString());
		
		System.out.println("=======================================");
		System.out.println("     상품정보 등록(입력) 시스템 V1");
		System.out.println("---------------------------------------");
		System.out.println("상품 정보를 입력하시오.");
		System.out.println("---------------------------------------");
		
		System.out.print("상품코드 >> ");
		pVO.strPCode = scan.nextLine();
		
		System.out.print("상품명 >> ");
		pVO.strPName = scan.nextLine();
		
		System.out.print("거래처 >> ");
		pVO.strDName = scan.nextLine();

		System.out.print("품목 >> ");
		pVO.strItem = scan.nextLine();

		System.out.print("매입단가 >> ");
		String strTemp = scan.nextLine();
		pVO.iPrice = Integer.valueOf(strTemp);

		System.out.print("매출단가 >> ");
		strTemp = scan.nextLine();
		pVO.oPrice = Integer.valueOf(strTemp);
		
		pVO.toString();
		
		System.out.println("\n|=======================================|");
		System.out.println("|상품코드 : " + pVO.strPCode + "\t\t|");
		System.out.println("|상품명 : " + pVO.strPName + "\t\t\t|");
		System.out.println("|거래처 : " + pVO.strDName + "\t\t\t\t|");
		System.out.println("|품목 : " + pVO.strItem + "\t\t\t\t|");
		System.out.println("|매입단가 : " + pVO.iPrice + "\t\t\t\t|");
		System.out.println("|매출단가 : " + pVO.oPrice + "\t\t\t\t|");
		System.out.println("|=======================================|");

	}// end main
}// end class
