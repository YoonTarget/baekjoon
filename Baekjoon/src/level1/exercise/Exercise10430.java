package level1.exercise;

import java.util.Scanner;

public class Exercise10430 {

	public void abc() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A : ");
		int a = sc.nextInt();
		
		System.out.print("B : ");
		int b = sc.nextInt();
		
		System.out.print("C : ");
		int c = sc.nextInt();
		
		if(2 <= a && a <= 10000 && 2 <= b && b <= 10000
				&& 2 <= c && c <= 10000) {
			System.out.println("(A + B) % C : " + (a + b) % c);
			System.out.println("((A % C) + (B % C)) % C : " + ((a % c) + (b % c)) % c);
			System.out.println("(A * B) % C : " + (a * b) % c);
			System.out.println("((A % C) * (B % C)) % C : " + ((a % c) * (b % c)) % c);
		}
		
		sc.close();

	}

}
