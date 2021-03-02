package com.callor.cart.model;

public class CartVO {

	// 클래스 멤버 변수 선언
	private String userName;
	private String proName;
	private String date;
	private String time;
	private int qty;
	private int price;
	private int total;
	
	// getter, setter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
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
		return "CartVO [userName=" + userName + ", proName=" + proName + ", date=" + date + ", time=" + time + ", qty="
				+ qty + ", price=" + price + ", total=" + total + "]";
	}
	
}// class end
