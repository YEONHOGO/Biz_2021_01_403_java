package com.callor.oop.model;

/*
 * 쇼핑카트에 필요한 데이터 항목들
 * 구매자
 * 상품명(상품코드)
 * 규격
 * 날짜
 * 시각
 * 수량
 * 구매단가
 * 구매금액
 */
public class CartVO {
	
	// 인스턴스 변수의 은닉
	private String cartUserName;	// 구매자
	private String cartPName;		// 상풍명
	private String cartStd;			// 규격
	private String cartDate;		// 날짜
	private String cartTime;		// 시각
	private int cartQty;			// 수량
	private int cartPrice;			// 구매단가
	private int cartTotal;			// 구매금액
	
	// private으로 은닉된 인스턴스 변수에
	// 값을 저장, 읽기 하기 위한 용도의
	// getter(), setter() method 선언
	public String getCartUserName() {
		return cartUserName;
	}
	public void setCartUserName(String cartUserName) {
		this.cartUserName = cartUserName;
	}
	public String getCartPName() {
		return cartPName;
	}
	public void setCartPName(String cartPName) {
		this.cartPName = cartPName;
	}
	public String getCartStd() {
		return cartStd;
	}
	public void setCartStd(String cartStd) {
		this.cartStd = cartStd;
	}
	public String getCartDate() {
		return cartDate;
	}
	public void setCartDate(String cartDate) {
		this.cartDate = cartDate;
	}
	public String getCartTime() {
		return cartTime;
	}
	public void setCartTime(String cartTime) {
		this.cartTime = cartTime;
	}
	public int getCartQty() {
		return cartQty;
	}
	public void setCartQty(int cartQty) {
		this.cartQty = cartQty;
	}
	public int getCartPrice() {
		return cartPrice;
	}
	public void setCartPrice(int cartPrice) {
		this.cartPrice = cartPrice;
	}
	public int getCartTotal() {
		return cartTotal;
	}
	public void setCartTotal(int cartTotal) {
		this.cartTotal = cartTotal;
	}
	
	@Override
	public String toString() {
		return "CartVO [cartUserName=" + cartUserName + ", cartPName=" + cartPName + ", cartStd=" + cartStd
				+ ", cartDate=" + cartDate + ", cartTime=" + cartTime + ", cartQty=" + cartQty + ", cartPrice="
				+ cartPrice + ", cartTotal=" + cartTotal + "]";
	}
	

	
	
}// class end
