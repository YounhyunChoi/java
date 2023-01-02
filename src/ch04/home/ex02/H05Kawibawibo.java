package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aichoice = 0;
		int choice = 0;
		int result = 0;
		String yourChoice = "";
		String meChoice = "";
		String gameResult = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		choice = sc.nextInt();

		aichoice = (int)(Math.random() * 3) + 1;
		
		yourChoice = switch(choice) {
		case 1 -> "가위";
		case 2 -> "바위";
		default -> "보";
		};
		
		meChoice = switch(aichoice) {
		case 1 -> "가위";
		case 2 -> "바위";
		default -> "보";
		};
		
		if(choice == aichoice) {
			gameResult = "Fair.";
		} else if(choice == aichoice + 1 || choice == aichoice - 2) {
			gameResult = "You win.";
		} else
			gameResult = "You lose.";
		
		if(1 <= choice && choice <= 3)
			System.out.print("you: " + yourChoice + "\nMe: " + meChoice + "\n\n" + gameResult);
		else
			System.out.print("잘못된 입력값입니다.");
	}
}
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
You win.
You lose.
Fair.
중 하나이다.
--

1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/