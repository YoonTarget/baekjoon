package com.baekjoon.run;

import java.util.Scanner;

public class WatchRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			
			if(h != 0) {
				result = h * 60 + m - 45;
				h = result / 60;
				m = result % 60;
			}
			else {
				if(m < 45) {
					h = 23;
					m += 15;
				}
				else {
					m -= 45;
				}
			}
			
			System.out.println(h + " " + m);
		}
		
		sc.close();

	}

}
