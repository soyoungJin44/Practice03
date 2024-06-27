package com.javaex.ex03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int a = 1; a <= num; a++) {
			for(int b = num; b >= a; b--) {
				System.out.print("*");
			}System.out.println("");
		
		
		}
		for(int c = 2; c <= num; c++) {
			for(int d = 1; d <=c; d++) {
				System.out.print("*");
			}System.out.println("");
	
			
		}
		
		
		sc.close();
	}

}
