package exercise1;

import java.util.Scanner;

public class Exercise {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.print("a : ");
		a = sc.nextInt();
		System.out.print("b : ");
		b = sc.nextInt();
		System.out.print("c : ");
		c = sc.nextInt();
		
//		System.out.print((a + b) % c);
//		System.out.println((a % c) + (b % c) % c);
//		System.out.println((a * b) % c);
//		System.out.println((a % c) * (b % c) %c);
		
		System.out.println("a + b : " + a + b);
		System.out.println("a + b - c : " + (a + b - c));
		
		sc.close();
		
	}
	
}
