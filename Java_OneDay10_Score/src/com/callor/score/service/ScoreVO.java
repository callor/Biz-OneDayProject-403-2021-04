package com.callor.score.service;

public class ScoreVO {
	
	
	private Integer kor;
	private Integer eng;
	private Integer math;
	private Integer sci;
	private Integer hist;
	
	private Integer total;
	private Float avg;
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getSci() {
		return sci;
	}
	public void setSci(Integer sci) {
		this.sci = sci;
	}
	public Integer getHist() {
		return hist;
	}
	public void setHist(Integer hist) {
		this.hist = hist;
	}
	
	

}
