package com.callor.score.service.Impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{

	
	
	public ScoreServiceImplV1() {
		
	}
	
	// Random의 값들을 리스트에 저장하는 method
	public void makeScore() {
		Random rnd = new Random();
		
	}// makeScore end

	// 리스트에 값들을 파일에 저장하는 method
	public void saveScoreToFile() {
		FileWriter fileWriter;
		PrintWriter printWriter;
		
		
	}// saveScoreToFile end

	// 파일을 읽어드려서 출력하는 method
	public void loadScoreFromFile() {
		FileReader fileReader;
		BufferedReader buffer;
		
	}// loadScoreFromFile end

}// clss end
