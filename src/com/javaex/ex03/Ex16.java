package com.javaex.ex03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int count = 0;
		int result = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 5 == 0) {
				count++;
				result = result + i;
			}
		}System.out.println("5의 배수 개수: " + count);
		System.out.println("5의배수 합: " + result);
		sc.close();
		
	}

}
