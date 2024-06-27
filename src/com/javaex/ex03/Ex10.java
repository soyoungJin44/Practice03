package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = 0;
		int num2;
		
		for(int i = 0; i < 5; i++){
			System.out.print("숫자: ");
			num2 = sc.nextInt();
				
			if(num < num2) {
				num = num2;
			}
		}
		System.out.println("최대값은 " + num + "입니다.");
		sc.close();
	}

}
