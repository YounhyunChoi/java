package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int score = 0;
	      int tenDigit = 0;
	      int oneDigit = 0;
	      String grade = "";
	      
	      System.out.print("점수: ");
	      score = sc.nextInt();
	      
	      tenDigit = score / 10;
	      oneDigit = score % 10;
	      
	      if(9 <= tenDigit) grade = "A";
	      else if(8 <= tenDigit) grade = "B";
	      else grade = "C";
	      
	      if(80 <= score) {
		      if(8 <= oneDigit || 10 == tenDigit) grade += "+";
		      else if(oneDigit < 4) grade += "-";
	      }
	      
	      System.out.print(grade);
	 }
} 
/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 c
--

점수: 100
A+
*/