package ch06.ex03.case02;

import ch05.home.ex06.case02.Console;

public class Cat extends Animal {
	@Override	 //annotation
	public void shout() {
		Console.info("야옹야옹");
	}
	
}
