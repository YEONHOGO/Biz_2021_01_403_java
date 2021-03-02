package com.callor.oop.model;

/*
 * 카트정보를 담아 App에서 사용할
 * Value Object 클래스
 * 구매자, 상품명, 규격, 날짜, 시작, 수량, 구매단가, 구매금액
 */
public class CartVO {
	
	private String userName;
	private String producName;
	private String Standard;
	private String date;
	private String time;
	private int qty;
	private int price;
	private int total;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProducName() {
		return producName;
	}
	public void setProducName(String producName) {
		this.producName = producName;
	}
	public String getStandard() {
		return Standard;
	}
	public void setStandard(String standard) {
		Standard = standard;
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
		return "CartVO [userName=" + userName + ", producName=" + producName + ", Standard=" + Standard + ", date="
				+ date + ", time=" + time + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
	
	
	
	
	
}// class end
