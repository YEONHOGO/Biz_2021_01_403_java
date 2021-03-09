package com.callor.student.model;

/*
 * 학번		: stNum 	: String : 0 
 * 학생이름	: stName	: String : 1
 * 학과		: stDept	: String : 2
 * 학년		: stGrade	: int	 : 3
 * 반		: stHalf	: int	 : 4
 * 주소		: stAddress : String : 5
 * 전화번호	: stphoneNum: String : 6
 */
public class StudentVO {

	private String stNum;		// 학번
	private String stName;		// 학생이름
	private String stDept;		// 학과
	private int stGrade;		// 학년
	private int stHalf;			// 반
	private String stAddress;	// 주소
	private String stPhoneNum;	// 전화번호
	
	public StudentVO() {
	}
	
	public StudentVO(String stNum, String stName, String stDept, int stGrade, int stHalf, String stAddress,
			String stPhoneNum) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stDept = stDept;
		this.stGrade = stGrade;
		this.stHalf = stHalf;
		this.stAddress = stAddress;
		this.stPhoneNum = stPhoneNum;
	}

	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public int getStGrade() {
		return stGrade;
	}
	public void setStGrade(int stGrade) {
		this.stGrade = stGrade;
	}
	public int getStHalf() {
		return stHalf;
	}
	public void setStHalf(int stHalf) {
		this.stHalf = stHalf;
	}
	public String getStAddress() {
		return stAddress;
	}
	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}
	public String getStPhoneNum() {
		return stPhoneNum;
	}
	public void setStPhoneNum(String stPhoneNum) {
		this.stPhoneNum = stPhoneNum;
	}
	
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stDept=" + stDept + ", stGrade=" + stGrade
				+ ", stHalf=" + stHalf + ", stAddress=" + stAddress + ", stPhoneNum=" + stPhoneNum + "]";
	}
	
}// class end
