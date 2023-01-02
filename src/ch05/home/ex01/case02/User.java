package ch05.home.ex01.case02;

import java.time.LocalDate;

public class User {
	private String userName;
	private int userAge;
	private LocalDate date;
	
	public String getUserName() {
		return this.userName;
	}
	
	public int getUserAge() {
		return this.userAge;
	}
	
	public LocalDate getLocalDate() {
		return this.date;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public void setLocalDate(LocalDate date) {
		this.date = date;
	}
}
