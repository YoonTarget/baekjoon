package com.baekjoon.upgrade;

import java.util.Scanner;

public class ChessRun {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 체스는 총 16개의 피스 사용
		// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		
		// 각 피스 개수 입력
		int king = 1- sc.nextInt();
		int queen = 1- sc.nextInt();
		int rook = 2 - sc.nextInt();
		int bishop = 2 - sc.nextInt();
		int knight = 2 - sc.nextInt();
		int pawn = 8 - sc.nextInt();
		
		System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
		
//		int[] list = {king, queen, rook, bishop, knight, pawn};
//		
//		for(int i = 0; i < list.length; i++) {
//			
//		}
		
		// 피스 더하거나 빼기
		
		
		// 스캐너 반납
		sc.close();

	}

}
