package com.callor.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartList_02 {

	public static void main(String[] args) {

		List<CartVO> cartList = new ArrayList<CartVO>();
		CartVO cartVO;
		Scanner scan = new Scanner(System.in);

		System.out.println("=========================");
		System.out.println("상품선택");
		System.out.println("--------------------------");
		for (int i = 0; i < 3; i++) {
			cartVO = new CartVO();
			System.out.println("상품정보를 입력하세요");
			System.out.print("이름 >> ");
			String strName = scan.nextLine();
			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			int intQty = Integer.valueOf(strQty);
			System.out.print("가격 >> ");
			// 3000 이라고 입력하면 "3000"으로 입력되어
			// 문자열이다
			String strPrice = scan.nextLine();
			
			// "3000" 문자열형 숫자를 정수 3000으로 변경하여
			// intPrice 에 저장
			int intPrice = Integer.valueOf(strPrice);

			cartVO.setCartUserName(strName);
			cartVO.setCartPName(strPName);
			cartVO.setCartQty(intQty);
			cartVO.setCartPrice(intPrice);

			// cartVO를 cartList에 추가
			cartList.add(cartVO);
		} // for end

		System.out.println("=========================");
		System.out.println("상품내역");
		System.out.println("--------------------------");

		System.out.println("이름\t상품명\t수량\t가격");
		for (int i = 0; i < 3; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n", cartVO.getCartUserName(), cartVO.getCartPName(), cartVO.getCartQty(),
					cartVO.getCartPrice());
		} // for end
		System.out.println("=========================");
	}// main end
}// class end
