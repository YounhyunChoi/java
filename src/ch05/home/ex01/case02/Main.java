package ch05.home.ex01.case02;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		boolean repeat = false;
		
		do {
			System.out.print("이름: ");
			user.setUserName(sc.nextLine());
			
			repeat = user.getUserName().matches("[a-zA-Z가-힣]+");
			if(!repeat) System.out.println("이름을 다시 입력하세요.");
		} while(!repeat);
		
		do {
			System.out.print("나이: ");
			String age = sc.nextLine();
			
			repeat = age.matches("[0-9]+");
			if(!repeat) System.out.println("나이를 다시 입력하세요.");
			else user.setUserAge(Integer.parseInt(age)); 
		} while(!repeat);
		
		user.setLocalDate(LocalDate.now());
		
		System.out.printf("이름: %s\n나이: %d\n가입일: %s", user.getUserName(), user.getUserAge(), user.getLocalDate());
	}
}
/*
과제: 사용자를 생성하라.
user가 user의 이름, 나이를 입력한다.
app이 user의 가입일을 입력한다.
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/