package com.baekjoon.upgrade;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String str2 = "";
		int result = 0;
		
		for(int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		
		if(str.equals(str2)) {
			result = 1;
		}
		
		System.out.println(result);
		
		sc.close();

	}

}
