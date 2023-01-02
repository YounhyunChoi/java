package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "";
		int input = 0;
		int repeat = 0;
		
		do {
			System.out.print("한자리 자연수를 입력하세요. :");
			input = sc.nextInt();
			word = "" + input;
			repeat = word.length();
		} while(repeat != 1);
		
		System.out.println("끝");
	}
}
/*
과제: 한자리 자연수를 입력받아라.
*/