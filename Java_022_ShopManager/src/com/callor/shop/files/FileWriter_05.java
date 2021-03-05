package com.callor.shop.files;

import com.callor.shop.service.Impl.RndServiceImplV1;

/*
 * fils/nums.txt 파일 생성 - 위치
 * 1 ~ 1000 까지의 임의의 Random 수를 100개 생성
 * 숫다들을 한줄에 5개식 콜론(:)으로 구분
 */
public class FileWriter_05 {

	public static void main(String[] args) {
		
		RndServiceImplV1 rsV1 = new RndServiceImplV1();
		
		rsV1.makeRnd();		// 난수 생성
		rsV1.saveFileRnd();	// 파일에 저장
	
	}// main end
}// clss end
