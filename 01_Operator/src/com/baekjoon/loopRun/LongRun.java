package com.baekjoon.loopRun;

import java.util.Scanner;

public class LongRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = "";
		
		for(int i = 4; i <= num; i += 4) {
			str += "long ";
		}
		
		System.out.println(str + "int");
		
		sc.close();

	}

}
