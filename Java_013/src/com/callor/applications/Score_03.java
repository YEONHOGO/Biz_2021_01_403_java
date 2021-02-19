package com.callor.applications;

public class Score_03 {

	public static void main(String[] args) {
		
		// 5명 학생의 이름을 저장할 변수
		String strName_1 = "홍길동";
		String strName_2 = "이몽룡";
		String strName_3 = "성춘향";
		String strName_4 = "장녹수";
		String strName_5 = "임꺽정";
		
		// 5명 학생의 국어점수를 저장할 변수
		int Kor_1 = 90;
		int Kor_2 = 88;
		int Kor_3 = 65;
		int Kor_4 = 32;
		int Kor_5 = 78;
		
		// 5명 학생의 영어점수를 저장할 변수
		int eng_1 = 78;
		int eng_2 = 92;
		int eng_3 = 56;
		int eng_4 = 88;
		int eng_5 = 73;
		
		System.out.printf("%s\t%d\t%d\n",strName_1,Kor_1,eng_1);
		System.out.printf("%s\t%d\t%d\n",strName_2,Kor_2,eng_2);
		System.out.printf("%s\t%d\t%d\n",strName_3,Kor_3,eng_3);
		System.out.printf("%s\t%d\t%d\n",strName_4,Kor_4,eng_4);
		System.out.printf("%s\t%d\t%d\n",strName_5,Kor_5,eng_5);
		
		score();
		
	}// main end
	
	public static void score() {
		
		String strName[] = {"홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정"};
		int Kor[] = {90, 80, 65, 32, 78};
		int eng[] = {78, 92, 56, 88, 73};
		
		System.out.println("===================================");
		System.out.println("이름\t국어\t영어");
		System.out.println("-----------------------------------");
		for(int i = 0; i < strName.length ; i++) {
			System.out.printf("%s\t%d\t%d\n",strName[i],Kor[i],eng[i]);
		}
		System.out.println("===================================");
	}
	
}// class end