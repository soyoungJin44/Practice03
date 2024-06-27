package com.javaex.ex03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;

		while (true) {

			System.out.println("==========================");
			System.out.println("    [숫자맞추기게임 시작]");
			System.out.println("==========================");

			while (true) {

				System.out.print(">>");
				num = sc.nextInt();

				if (num > 29) {
					System.out.println("더낮게");
				} else if (num < 29) {
					System.out.println("더높게");
				} else if (num == 29) {
					System.out.println("맞았습니다.");
					break;
				}

			}
			sc.nextLine();
			System.out.print("게임을 종료하시겠습니까? (y/n) >>");
			String a = sc.nextLine();
			

			if (a.equals("y")) {
				System.out.println("==========================");
				System.out.println("    [숫자맞추기게임 종료]");
				System.out.println("==========================");
				break;
			}

		}

	}
}