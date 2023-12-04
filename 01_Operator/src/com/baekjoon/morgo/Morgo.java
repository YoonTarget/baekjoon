package com.baekjoon.morgo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Morgo {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 인원 수 입력
		int count = sc.nextInt();
		
		sc.nextLine();
		
		// 이름을 담을 리스트 생성
		ArrayList<String> list = new ArrayList<String>();
		
		// 인원 수만큼 반복문을 돌린다
		for(int i = 0; i < count; i++) {
			
			// 이름을 입력받는다
			String name = sc.nextLine();
			
			// 이름이 세 글자 이상이면 리스트에 담는다
			if(name.length() == 3) {
				list.add(name);
			}
			
		}
		
		String[] arr = new String[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		
		sc.close();

	}

}
