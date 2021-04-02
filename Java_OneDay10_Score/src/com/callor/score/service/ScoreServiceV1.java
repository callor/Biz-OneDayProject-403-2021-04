package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreServiceV1 {
	
	List<ScoreVO> scoreList;
	Scanner scan;
	public ScoreServiceV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	public void inputScore() {
		System.out.println("과목별 성적 입력하세요");
		Integer kor = this.inputScore("국어");
		if(kor == null) {
			return;
		}
		Integer eng = this.inputScore("영어");
		if(eng == null) {
			return;
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(kor);
		scoreVO.setEng(eng);
		scoreList.add(scoreVO);
	}
	
	public Integer inputScore(String subject) {
		while(true) {
			System.out.print(subject + ">> ");
			String strScore = scan.nextLine();
			if(strScore.equals("QUIT")) {
				return null;
			}
			Integer intScore = 0;
			try {
				intScore = Integer.valueOf(strScore);
			} catch (Exception e) {
				System.out.println("성적은 숫자로만 입력");
				continue;
			}
			if(intScore < 0 || intScore > 100) {
				System.out.println("0 ~ 100까지");
				continue;
			}
			return intScore;
		}
	}
	
	
	public void printList() {
		
		System.out.println("성적리스트");

		int totalKor = 0;
		int totalEng = 0;
		int totalMath = 0;
		int totalSci = 0;
		int totalHist = 0;
		
		int allTotal = 0;
		float allAvg = 0;
		
		for(int i = 0 ; i < scoreList.size(); i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng()+ "\t");
			System.out.print(vo.getMath()+ "\t");
			System.out.print(vo.getSci()+ "\t");
			System.out.print(vo.getHist()+ "\t");
			
			System.out.print(vo.getTotal()+ "\t");
			System.out.print(vo.getAvg()+ "\t");
			
			totalKor += vo.getKor();
			totalEng += vo.getEng();
			totalMath += vo.getMath();
			totalSci += vo.getSci();
			totalHist += vo.getHist();
			
			allTotal += vo.getTotal();
			allAvg += vo.getAvg();
			
		}
		System.out.println();
		
		System.out.print("총점\t");
		System.out.print(totalKor + "\t");
		System.out.print(totalEng + "\t");
		System.out.print(totalMath + "\t");
		System.out.print(totalSci + "\t");
		System.out.print(totalHist + "\t");
		
		System.out.print(allTotal + "\t");
		System.out.print( allAvg/scoreList.size() + "\n" );
		
	}
}
