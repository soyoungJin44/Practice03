package com.javaex.ex03;

public class Ex08 {

	public static void main(String[] args) {

		for(int n = 1; n <= 9; n++) {
			for(int dan = 2; dan <10; dan++) {
				
				System.out.print(dan + "*" + n + "=" + (n*dan));
				System.out.print("	");
				
			}System.out.println();
		}
		
	}
}