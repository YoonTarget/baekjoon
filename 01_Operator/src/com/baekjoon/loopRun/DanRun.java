package com.baekjoon.loopRun;

import java.util.Scanner;

public class DanRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
		sc.close();

	}

}