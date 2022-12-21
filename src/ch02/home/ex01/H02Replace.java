package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a를 입력하시오.\n> ");	// presentation logic, IO(Input/Output)
		int a = sc.nextInt();
		System.out.print("b를 입력하시오.\n> ");
		int b = sc.nextInt();
		System.out.printf("a=%d b=%d\n", a, b);
		
		System.out.println("a, b 값을 교체합니다.");
		int c = 0;	// business logic
		c = a;
		a = b;
		b = c;
		System.out.printf("a=%d b=%d", a, b);
	}
}