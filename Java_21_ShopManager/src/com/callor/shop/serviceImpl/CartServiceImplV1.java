package com.callor.shop.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceImplV1 implements CartService{

	// 멤버
	private Scanner scan;
	private List<CartVO> cartList;

	// 생성자
	public CartServiceImplV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}
	
	// 카트리스트 입력
	public void inputCart() {
		
		// 제목 출력
		System.out.println("=======================");
		System.out.println("장바구니 상품 담기");
		System.out.println("-----------------------");
		
		// 구매자
		System.out.print("구매자>> ");
		String strUserName = scan.nextLine();
		
		// 상품명
		System.out.print("상품명>> ");
		String strProductName = scan.nextLine();
		
		// 수량
		int intQty = 0;
		while(true) {
			System.out.print("수량>> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				// 입력된 값이 1 이상
				if(intQty > 0) {
					break;
				} else {
					System.out.println("수량은 1 이상으로 입력하세요");
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로 입력하세요");
			}// try end
		}// while end
		
		
		// 단가
		int intPrice = 0;
		while(true) {
			
			System.out.print("단가>> ");
			String strPrice = scan.nextLine();
			
			try {
				intPrice = Integer.valueOf(strPrice);
				// 입력된 값이 1 이상
				if(intPrice > 0) {
					break;
				} else {
					System.out.println("단가는 1 이상으로 입력하세요");
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로 입력하세요");
			}// try end
		}// while end
		
		// 카트리스트 정보 생성
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intPrice * intQty);
		
		// 카트리스트 정보 입력
		cartList.add(cartVO);
		
	}// inputCart end

	// 카트 전체리스트 출력
	public void printCart() {
		
		// caltList size, total
		int nsize = cartList.size();
		int total = 0;
		
		// 제목 출력
		System.out.println("==============================================");
		System.out.println("구매자\t상품명\t\t단가\t수량\t합계");
		System.out.println("----------------------------------------------");
		
		// 내용 출력
		for(int i = 0; i < nsize; i++) {
			System.out.printf("%s\t%s\t\t%d\t%d\t%d\n",
					cartList.get(i).getUserName(),
					cartList.get(i).getProductName(),
					cartList.get(i).getPrice(),
					cartList.get(i).getQty(),
					cartList.get(i).getTotal());
			
			// total 구하기
			total += cartList.get(i).getTotal();
		}
		
		// 마무리 및 갯수, 합계 출력
		System.out.println("----------------------------------------------");
		System.out.printf("합계\t%d가지\t\t\t\t%d\n",nsize,total);
		System.out.println("==============================================");
		
	}// printCart end, 카트 전체리스트 출력

	// 구매자별 카트리스트 출력
	public void cartByBuyer() {
		
		// cartList size, total
		int nsize = cartList.size();
		int total = 0;
		String strUserName = new String();
		boolean bYes = false;
		int count = 0;
		
		// 구매자 이름 제목 출력
		System.out.println("====================================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("------------------------------------");
		
		// 구매자 이름 입력
		
		while(true) {
			System.out.print("이름>> ");
			strUserName = scan.nextLine();
			
			if(strUserName.equals("QUIT")) {
				return;
			}
			
			for(int i = 0; i < nsize; i++) {
				bYes = cartList.get(i).getUserName().equals(strUserName);
				if(bYes) {
					break;
				}// if end
			}// for end
			if(bYes) {
				break;
			} else {
				System.out.printf("%s라는 이름의 구매자는 없습니다.\n",strUserName);
				System.out.println("QUIT : 메뉴로 복귀");
			}
		}// while end
		
		// 장바구니 리스트 제목 출력
		System.out.printf("\n* %s 장바구니 리스트\n",strUserName);
		System.out.println("==============================================");
		
		// 구매자별 장바구니 리스트 내용 출력
		for(int i = 0; i < nsize; i++) {
			
			// 입력된 이름과 장바구니 내의 구매자 이름을 비교
			if(cartList.get(i).getUserName().equals(strUserName)) {
				System.out.printf("%s\t%s\t\t%d\t%d\t%d\n",
						cartList.get(i).getUserName(),
						cartList.get(i).getProductName(),
						cartList.get(i).getPrice(),
						cartList.get(i).getQty(),
						cartList.get(i).getTotal());
				
				// count
				count++;
				
				// total 구하기
				total += cartList.get(i).getTotal();
			}// if end
		}// for end
		
		
		// 마무리 및 갯수, 합계 출력
		System.out.println("----------------------------------------------");
		System.out.printf("합계\t%d가지\t\t\t\t%d\n",count,total);
		System.out.println("==============================================");

	}// cartByBuyer end, 구매자별 카트리스트 출력

}// class end
