package com.callor.iolist.model;

public class IoListVO {

	private String date;				// 걸래 일자
	private String produntName;			// 상품명
	private String acCount;				// 거래처
	private String representativeName; 	// 대표자명
	private int division;				// 구분
	private int buyPrice;				// 매입 단가
	private int salePrice; 				// 판매 단가
	private int qty;					// 수량
	private int buyTotalPrice;			// 매입 총금액
	private int saleTotalPrice;			// 판매 총금액
	
	
	
	
	public IoListVO() {
	}

	public IoListVO(String date, String produntName, String acCount, String representativeName, int division,
			int buyPrice, int salePrice, int qty) {
		super();
		this.date = date;
		this.produntName = produntName;
		this.acCount = acCount;
		this.representativeName = representativeName;
		this.division = division;
		this.buyPrice = buyPrice;
		this.salePrice = salePrice;
		this.qty = qty;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProduntName() {
		return produntName;
	}
	public void setProduntName(String produntName) {
		this.produntName = produntName;
	}
	public String getAcCount() {
		return acCount;
	}
	public void setAcCount(String acCount) {
		this.acCount = acCount;
	}
	public String getRepresentativeName() {
		return representativeName;
	}
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}
	public int getDivision() {
		return division;
	}
	public void setDivision(int division) {
		this.division = division;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getBuyTotalPrice() {
		return buyTotalPrice;
	}
	public void setBuyTotalPrice(int buyTotalPrice) {
		this.buyTotalPrice = buyTotalPrice;
	}
	public int getSaleTotalPrice() {
		return saleTotalPrice;
	}
	public void setSaleTotalPrice(int saleTotalPrice) {
		this.saleTotalPrice = saleTotalPrice;
	}
	
	@Override
	public String toString() {
		return "loListVO [date=" + date + ", produntName=" + produntName + ", acCount=" + acCount
				+ ", representativeName=" + representativeName + ", division=" + division + ", buyPrice=" + buyPrice
				+ ", salePrice=" + salePrice + ", qty=" + qty + ", buyTotalPrice=" + buyTotalPrice + ", saleTotalPrice="
				+ saleTotalPrice + "]";
	}
	
	
	
	
	
	
	
}// class end
