package com.baekjoon.run;

import java.util.Scanner;

public class OvenRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int time = sc.nextInt();
		int result = 0;
		
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59 && time >=0 && time <= 1000) {
			result = h * 60 + m + time;
			h = result / 60;
			m = result % 60;
			if(h >= 24) {
				h -= 24;
			}
		}
		
		System.out.println(h + " " + m);
		
		sc.close();

	}

}
