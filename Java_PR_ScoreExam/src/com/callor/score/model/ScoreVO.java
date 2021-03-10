package com.callor.score.model;

/*
 * 학번,국어,영어,수학,음악,총점,평균
 * 학번 : String : scoreNum
 * 국어 : int	 : scoreKor
 * 영어 : int	 : scoreEng
 * 수학 : int	 : scoreMath
 * 음악 : int	 : scoreMusic
 * 총점 : int	 : scoreTotal
 * 평균 : float	 : scoreAvg
 */
public class ScoreVO {

	private String scoreNum;	// 학번
	private int scoreKor;		// 국어
	private int scoreEng;		// 영어
	private int scoreMath;		// 수학
	private int scoreMusic;		// 음악
	private int scoreTotal;		// 총점
	private float scoreAvg;		// 평균
	
	public ScoreVO() {
	}
	
	public ScoreVO(String scoreNum, int scoreKor, int scoreEng, int scoreMath, int scoreMusic) {
		super();
		this.scoreNum = scoreNum;
		this.scoreKor = scoreKor;
		this.scoreEng = scoreEng;
		this.scoreMath = scoreMath;
		this.scoreMusic = scoreMusic;
	}



	public String getScoreNum() {
		return scoreNum;
	}
	public void setScoreNum(String scoreNum) {
		this.scoreNum = scoreNum;
	}
	public int getScoreKor() {
		return scoreKor;
	}
	public void setScoreKor(int scoreKor) {
		this.scoreKor = scoreKor;
	}
	public int getScoreEng() {
		return scoreEng;
	}
	public void setScoreEng(int scoreEng) {
		this.scoreEng = scoreEng;
	}
	public int getScoreMath() {
		return scoreMath;
	}
	public void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}
	public int getScoreMusic() {
		return scoreMusic;
	}
	public void setScoreMusic(int scoreMusic) {
		this.scoreMusic = scoreMusic;
	}
	public int getScoreTotal() {
		this.scoreTotal = this.getScoreKor();
		this.scoreTotal += this.getScoreEng();
		this.scoreTotal += this.getScoreMath();
		this.scoreTotal += this.getScoreMusic();
		
		return scoreTotal;
	}
	public void setScoreTotal(int scoreTotal) {
		this.scoreTotal = scoreTotal;
	}
	public float getScoreAvg() {
		this.scoreAvg = (float)this.getScoreTotal() / 4;
		return scoreAvg;
	}
	public void setScoreAvg(float scoreAvg) {
		this.scoreAvg = scoreAvg;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [scoreNum=" + scoreNum + ", scoreKor=" + scoreKor + ", scoreEng=" + scoreEng + ", scoreMath="
				+ scoreMath + ", scoreMusic=" + scoreMusic + ", scoreTotal=" + scoreTotal + ", scoreAvg=" + scoreAvg
				+ "]";
	}
	
	
	
}// class end
