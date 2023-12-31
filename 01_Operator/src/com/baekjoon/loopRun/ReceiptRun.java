package com.baekjoon.loopRun;

import java.util.Scanner;

public class ReceiptRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int total = 0;
		
		if(x >= 1 && x <= 1000000000 && n >= 1 && n <= 100) {
			
			for(int i = 0; i < n; i++) {
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(a >= 1 && a <= 1000000 && b >= 1 && b <= 10) {
					
					total += a * b;
					
				}
				
			}
			
			if(x == total) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
		
		sc.close();

	}

}
