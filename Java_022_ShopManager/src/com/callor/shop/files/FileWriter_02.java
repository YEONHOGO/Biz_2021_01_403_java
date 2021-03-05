package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.shop.values.Values;

public class FileWriter_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		int[] nums = new int[100];
		String numFileName = "src/com/callor/shop/files/nums.txt";
	
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		

		try {
			fileWriter = new FileWriter(numFileName);
			
			printWriter = new PrintWriter(fileWriter);

			// nums 배열에 담긴 전체리스트를
			// 향상된 for로 반복하면서 파일에 출력
			for(int n : nums) {
				printWriter.println(n);
			}	
			
			printWriter.println(Values.dLine);
			
			// 리스트 응용
			int size = intList.size();
			for(int i = 0; i < size ; i++) {
				printWriter.println(intList.get(i));
			}
			printWriter.println(Values.dLine);
			
			// 직접 출력
			for(int i = 0; i < 100; i++) {
				printWriter.println((rnd.nextInt(1000) + 1));
			}
			printWriter.println(Values.dLine);
			
			// 배열 응용
			for(int i = 0; i < nums.length; i++) {
				printWriter.println(nums[i]);
			}
			
			printWriter.close();
			fileWriter.close();
			System.out.println("Mission Complete!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}// main end
}// class end
