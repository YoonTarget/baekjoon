package com.baekjoon.loopRun;

import java.util.Scanner;

public class Sum3Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > 0 && a < 10 && b > 0 && b < 10) {
				System.out.println("Case #" + (i + 1) + ": " + (a + b));
			}
		}
		
		sc.close();

	}

}
