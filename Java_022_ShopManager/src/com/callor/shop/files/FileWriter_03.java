package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.shop.values.Values;

public class FileWriter_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		String numFileName = "src/com/callor/shop/files/nums.txt";
	
		// 리스트를 만들어서 Random수를 저장하기
		List<Integer> intList = new ArrayList<Integer>();
		
		
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		for(int i = 0; i < 100; i++) {
			// 1번코드
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
			
			// 2번코드
			intList.add(rnd.nextInt(1000) + 1);
		}
		

		try {
			fileWriter = new FileWriter(numFileName);
			
			printWriter = new PrintWriter(fileWriter);

			// intList 에 담긴 전체리스트를
			// 향상된 for로 반복하면서 파일에 출력
			for(int n : intList) {
				printWriter.println(n);
			}	
			
			
			// 표준형 for로 반복하면서 파일에 출력
			int size = intList.size();
			for(int i = 0; i < size ; i++) {
				Integer n = intList.get(i);
				printWriter.println(n);
			}
			printWriter.println(Values.dLine);
			
			printWriter.close();
			fileWriter.close();
			System.out.println("Mission Complete!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}// main end
}// class end
