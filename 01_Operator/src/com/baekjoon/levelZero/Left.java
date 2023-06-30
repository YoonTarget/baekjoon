package com.baekjoon.levelZero;

import java.util.Scanner;

public class Left {
	
	public void method1() {
		//(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		//(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		//세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// a, b, c 입력
		System.out.print("a : " );
		int a = sc.nextInt();

		System.out.print("b : " );
		int b = sc.nextInt();
		
		System.out.print("c : " );
		int c = sc.nextInt();
		
		// 연산결과 출력
		System.out.println("(a + b) % c : " + (a + b) % c);
		System.out.println("((a % c) + (b % c)) % c : " + ((a % c) + (b % c)) % c);
		System.out.println("(a * b) % c : " + (a * b) % c);
		System.out.println("((a % c) * (b % c)) % c : " + ((a % c) * (b % c)) % c);
		
		// 스캐너 종료
		sc.close();
		
	}

}
