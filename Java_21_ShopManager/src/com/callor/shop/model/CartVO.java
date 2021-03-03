package com.callor.shop.model;

public class CartVO {

	// 클래스 멤버 변수
	private String userName;	// 이름
	private String productName;	// 상품명
	private String date;		// 날짜
	private String time;		// 시간
	private int qty;			// 수량
	private int price;			// 가격
	private int total;			// 합계
	
	// getter, setter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", date=" + date + ", time=" + time
				+ ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
}// class end
