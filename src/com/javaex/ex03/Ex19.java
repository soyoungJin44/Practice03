package com.javaex.ex03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int c = 0;
		
		while(true) {
		
			System.out.println("----------------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("----------------------------");
			
			System.out.print("선택> ");
			c = sc.nextInt(); 
			
			if(c == 1) {
				System.out.print("예금액: ");
				int p = sc.nextInt();
				result = result+p;
			}
			else if(c == 2) {
				System.out.print("출금액: ");
				int m = sc.nextInt(); 
				result = result - m;
			}
			else if(c == 3) {
				System.out.println("잔고액> " + result);
			}
			else if(c == 4) {
				break;
			}else {
				System.out.println("다시입력해주세요");
			}
			
		  
	}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
