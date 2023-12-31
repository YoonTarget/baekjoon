package com.baekjoon.run;

import java.util.Scanner;

public class DiceRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = 0;
		
		if(num1 >= 1 && num1 <= 6
				&& num2 >= 1 && num2 <= 6
				&& num3 >= 1 && num3 <= 6) {
			
			if(num1 == num2 && num2 == num3 && num3 == num1) {
				result = 10000 + num1 * 1000;
			}
			else if(num1 != num2 && num2 != num3 && num3 != num1) {
				result = Math.max(Math.max(num1, num2), num3) * 100;
			}
			else {
				if(num1 == num2 || num2 == num3) {
					result = 1000 + num2 * 100;
				}
				else {
					result = 1000 + num1 * 100;
				}
			}
			
		}
		
		System.out.println(result);
		
		sc.close();

	}

}
