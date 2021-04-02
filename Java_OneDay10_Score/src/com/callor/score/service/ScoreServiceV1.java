package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV1 {
	
	List<ScoreVO> scoreList;
	public ScoreServiceV1() {
		scoreList = new ArrayList<ScoreVO>();
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
