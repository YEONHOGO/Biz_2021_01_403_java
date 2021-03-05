package com.callor.shop.service.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV2 {

	
	private List<Integer> intList;
	private String fileName;
	
	/*
	 * 매개변수가 없는 생성자와
	 * 파일이름을 매개변수로 전달받아야 하는 생성자를
	 * 선언했다.
	 * 
	 * 매개변수가 없는 생성자를 호출하여 객체를 생성하면
	 * (= nue RndServiceImplV2()라고 하면)
	 * 파일이름을 매개변수를 전달하면서
	 *  다시 매개변수가 있는 생성자를 호출한다.
	 */
	
	public RndServiceImplV2() {
		this("src/com/callor/shop/files/nums_rnd.txt");
	}
	
	/*
	 * 매개변수가 있는 생성자는 객체를 생성할때
	 * 반드시 파일이름을 전달받아야만 한다.
	 * 
	 * = new RndServiceImplV2(파일이름);
	 */
	
	// 생성자
	public RndServiceImplV2(String fileName) {
		intList = new ArrayList<Integer>();
		this.fileName = fileName;
	}// 클래스 생성자 end
	
	// Random 수를 생성하여 List에 담을 method
	public void makeRnd() {
		Random rnd = new Random();
		for(int i = 0 ; i < 100; i++) {
			 intList.add(rnd.nextInt(1000) + 1) ;
		}
		
	}// rndNums end
	
	public void saveFileRnd() {
		this.saveFileRnd("src/com/callor/shop/files/nums_rnd.txt");
	}

	
	// List에 담긴 숫자들을 파일에 저장하는 method
	// 저장할 파일 이름을 코드에 포함하지 않고
	// saveFileRnd() method를 호출하는 곳에서
	//		파일이름을 전달해 주도록 변경
	public void saveFileRnd(String fileName) {
		// 선언
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			// 초기화
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);
			
			// 줄바꿈을 위한 변수
			int ncount = 0;
			
			// List에 담긴 숫자들을 전부 파일에 출력, 5번출력하고나서 줄바꿈
			for(Integer n : intList) {
				printWriter.print(n + ":");
				if(++ncount % 5 == 0) {
					printWriter.println();
				}
			}
			
			// close
			printWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Mission Complete!!");
	}// saveFile end
	
	/*
	 * 
	 */
	public void loadFileRnd() {
		
	}
	
}// clss end
