package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		int a;
		int b;
		int c = 0;
		
		a = 1;
		b = 2;
		
		System.out.printf("a=%d b=%d\n", a, b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.printf("a=%d b=%d", a, b);
	}
}