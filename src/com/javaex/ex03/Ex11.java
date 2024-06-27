package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		int result1 = 0;
		int result2 = 0;
	
		for(int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				result1 = result1 + i;
			}else if(i % 2 != 0) {
				result2 = result2 + i;
			}
		}if(num % 2 == 0) {
		System.out.println("결과값은: " + result1 + "입니다.");
		}else {
			System.out.println("결과값은: " + result2 + "입니다.");
		}
		
		sc.close();
		
	}

}
