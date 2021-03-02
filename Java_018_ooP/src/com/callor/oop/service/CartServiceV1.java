package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	// 클래스 영역
	private List<CartVO> cartList = new ArrayList<CartVO>();;
	private CartVO cartVO;
	
	public void inputCart() {
		this.cartVO = new CartVO();
		Scanner scan = new Scanner(System.in);
		
		// 제목보이기
		System.out.println("======================");
		System.out.println("상품정보 입력");
		System.out.println("----------------------");
		
		// 상품정보 입력
		System.out.print("이름>> ");
		String strUserName = scan.nextLine();
		
		System.out.print("상품명>> ");
		String strPName = scan.nextLine();
		
		// 수량정보 입력
		int intQty = 0;
		while(true) {
			System.out.print("수량>> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if(intQty < 2) {
					System.out.println("수량는 2이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량는 숫자로 입력해주세요");
			}
		}// while end

		// 단가정보 입력
		int intPrice = 0;
		while(true) {
			System.out.print("단가>> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if(intPrice < 1000) {
					System.out.println("단가는 1000이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로 입력해주세");
			}
		}// while end
		
		// 카트정보 생성
		cartVO.setCartUserName(strUserName);
		cartVO.setCartPName(strPName);
		cartVO.setCartQty(intQty);
		cartVO.setCartPrice(intPrice);
		
		// 카트정보 리스트에 추가하기
		cartList.add(cartVO);
	}// inputCart end
	
	public void printCartList() {
		// 상품정보 출력
		int size = cartList.size();
		for(int i = 0; i < size ; i++) {
		System.out.println("\n=====================================");
		System.out.println("\t상품정보");
		System.out.println("-------------------------------------");
		System.out.println("이름\t상품명\t수량\t단가");
		System.out.printf("%s\t%s\t%d\t%d\n",
						cartList.get(i).getCartUserName(),
						cartList.get(i).getCartPName(),
						cartList.get(i).getCartQty(),
						cartList.get(i).getCartPrice());
		System.out.println("=====================================");
		}// for end
	}// printCartList end
	
}// class end
