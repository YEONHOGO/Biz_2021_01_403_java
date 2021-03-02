package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImplV3 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;
	
	public CartServiceImplV3() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}
	
	public void inputCart() {
		
		
		while(true) {// [1] 입력
			
			int intQty = 0;
			int intPrice = 0;
			
			System.out.println("===================");
			System.out.println("빛나라 카트 시스템");
			System.out.println("-------------------");
			
			System.out.print("구매자(QUIT : 끝내기)>> ");
			String strUserName = scan.nextLine();
			if(strUserName == "QUIT") {
				break;
			}
			
			// while() 반복문을 사용하여 코드를 작성할때는
			//  사용자 반복문을 중단(종료)할 수 있는
			// 탈출구를 만들어 주어야 한다.
			System.out.print("상품명(QUIT : 끝내기)>> ");
			String strProName = scan.nextLine();
			if(strProName == "QUIT") {
				break;
			}
			
			while(true) {// [2] 수량
				System.out.print("수량(QUIT : 끝내기)>> ");
				String strQty = scan.nextLine();
				if(strQty == "QUIT") {
					break;
				}
				try {
					intQty = Integer.valueOf(strQty);
					if(intQty < 1) {
						System.out.println("수량은 1개 이상 입력하세요");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로만 입력하세요");
				}
			}// while end [2] 수량
			
			while(true) {// [3] 단가
				System.out.print("단가(QUIT : 끝내기)>> ");
				String strPrice = scan.nextLine();
				if(strPrice == "QUIT") {
					break;
				}
				try {
					intPrice = Integer.valueOf(strPrice);
					if(intPrice < 1) {
						System.out.println("단가는 1개 이상 입력하세요");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("단가는 숫자로만 입력하세요");
				}
			}// while end [3] 단가
			
			// 카트에 저장
			CartVO cartVO = new CartVO();
			cartVO.setUserName(strUserName);
			cartVO.setProducName(strProName);
			cartVO.setPrice(intPrice);
			cartVO.setQty(intQty);
			cartVO.setTotal(intPrice * intQty);
			
			cartList.add(cartVO);
		}// while end [1] 입력
	}

	public void printCart() {

		int nsize = cartList.size();
		for(int i = 0; i < nsize ; i++) {
			System.out.println(cartList.get(i).toString());
		}
		
	}

}// class end
