package ch05.ex02.case02;

import java.time.LocalDate;

public class Board {
	private String msg;
	private LocalDate writtenDate;
	
	public String getMsg() {
		return this.msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public LocalDate getWrittenDate() {
		return this.writtenDate;
	}
	
	public void setWrittenDate(LocalDate writtenDate) {
		this.writtenDate = writtenDate;
	}
}
