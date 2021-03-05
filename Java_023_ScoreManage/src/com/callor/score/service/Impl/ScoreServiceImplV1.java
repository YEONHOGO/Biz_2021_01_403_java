package com.callor.score.service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.valeus.Values;

public class ScoreServiceImplV1 implements ScoreService{

	private List<String> scoreString;
	private List<ScoreVO> scoreList;
	private String fileName;
	
	// 생성자
	public ScoreServiceImplV1() {
		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/score.txt";
	}
	
	// Random의 값들을 리스트에 저장하는 method
	public void makeScore() {
		scoreString = new ArrayList<String>();
		Random rnd = new Random();
		
		for(int i = 0; i < 20 ; i++) {
					
			// 성적리스트 생성
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(rnd.nextInt(100) + 1);
			scoreVO.setEng(rnd.nextInt(100) + 1);
			scoreVO.setMath(rnd.nextInt(100) + 1);
			scoreVO.setMusic(rnd.nextInt(100) + 1);
			scoreVO.setHistory(rnd.nextInt(100) + 1);
			
			// 성적 리스트 추가
			scoreList.add(scoreVO);
		}
		scoreString = new ArrayList<String>();
	}// makeScore end

	// 리스트에 값들을 파일에 저장하는 method
	public void saveScoreToFile() {
		FileWriter fileWriter;
		PrintWriter printWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);
			
			int nsize = scoreList.size();
			for(int i = 0; i < nsize ; i++) {
				ScoreVO scoreVO = scoreList.get(i);
				printWriter.print(scoreVO.getKor() + ":");
				printWriter.print(scoreVO.getEng() + ":");
				printWriter.print(scoreVO.getMath() + ":");
				printWriter.print(scoreVO.getMusic() + ":");
				printWriter.print(scoreVO.getHistory() + ":\n");

			}
			
			printWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scoreString = new ArrayList<String>();
	}// saveScoreToFile end

	// 파일을 읽어드려서 출력하는 method
	public void loadScoreFromFile() {
		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();
		FileReader fileReader;
		BufferedReader buffer;
		
		// 파일을 읽어 들여서 '한줄씩'  scoreString에 담기
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
					
			while(true) {
				String str = buffer.readLine();
				if(str == null) {
					break;
				}
				scoreString.add(str);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 한줄씩 읽어 들인 값들을 분류하기
		for(String str : scoreString) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setMusic(Integer.valueOf(scores[3]));
			scoreVO.setHistory(Integer.valueOf(scores[4]));
			
			scoreList.add(scoreVO);
		}
		
		// 분류한 성적들의 합계, 평균 구하기
		for(ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			
			float avg = (float)sum / 5;
			
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		
		
		
		
		// 분류한 값들을 출력하기
		// 제목 출력
		System.out.println(Values.dLine);
		System.out.println("순번\t\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		
		// 데이터 출력
		int count = 0;
		for(ScoreVO vo : scoreList) {
			System.out.print(++count + "\t\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		
		
		// 마무리
		System.out.println(Values.dLine);
		
		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();

	}// loadScoreFromFile end

}// clss end
