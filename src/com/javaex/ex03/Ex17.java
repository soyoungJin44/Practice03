package com.javaex.ex03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int a = num; a >= i ; a--) {
				System.out.print("*");
				
			}System.out.println();
			 
				
		}
		
		sc.close();
		
	}

}
