package com.baekjoon.run;

import java.util.Scanner;

public class WatchRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			
			if(m < 45) {
				m += 15;
				if(h == 0) {
					h = 23;
				}
				else {
					h -= 1;
				}
			}
			else {
				m -= 45;
			}
			
			System.out.println(h + " " + m);
		}
		
		sc.close();

	}

}
