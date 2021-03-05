package com.callor.shop.files;

import com.callor.shop.service.Impl.RndServiceImplV2;

/*
 * fils/nums.txt 파일 생성 - 위치
 * 1 ~ 1000 까지의 임의의 Random 수를 100개 생성
 * 숫다들을 한줄에 5개식 콜론(:)으로 구분
 */
public class FileWriter_06 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		RndServiceImplV2 rsV2 = new RndServiceImplV2(fileName);
		
		rsV2.makeRnd();		// 난수 생성
//		rsV2.saveFileRnd(fileName);	// 파일에 저장
		rsV2.saveFileRnd();
	
	}// main end
}// clss end
