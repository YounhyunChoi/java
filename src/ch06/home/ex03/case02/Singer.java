package ch06.home.ex03.case02;

import ch05.home.ex06.case02.Console;

public class Singer extends Job {
	@Override
	public void perform() {
		Console.info("랄랄라.");
	}
}
