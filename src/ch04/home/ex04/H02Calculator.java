package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		String op = "";
		boolean repeat = false;
		int result = 0;
		int a = 0;
		int b = 0;
		int opLength = 0;
		do {
			do {
				System.out.print("a: ");
				input = sc.nextLine();
				
				repeat = input.matches("[0-9]+");
				if(!repeat) {
					System.out.println("a값을 다시 입력하세요.");
				}
			} while(!repeat);

			a = Integer.parseInt(input);

			do {
				repeat = false;
				System.out.print("op: ");
				op = sc.nextLine();
				
				repeat = op.matches("[+-/\\*]*");
				opLength = op.length();
				
				if(!repeat || opLength != 1) {
					System.out.println("잘못된 연산자입니다.");
				}
			} while(!repeat || opLength != 1);
			
			do {
				repeat = false;
				System.out.print("b: ");
				input = sc.nextLine();
				
				repeat = input.matches("[0-9]+");
				if(!repeat) {
					System.out.println("b값을 다시 입력하세요.");
				}
			} while(!repeat);
				
			b = Integer.parseInt(input);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.println(a + " " + op + " " + b + " = " + result);
			System.out.print("continue(y/n)? ");
		} while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}
