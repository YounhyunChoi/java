package ch05.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Player.teamName = "호랑이";
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.playerName = "최한석";
		player2.playerName = "최한석";
		
		System.out.printf("%s %s\n", player1.playerName, player1.teamName); // 최한석 호랑이
		System.out.printf("%s %s\n", player2.playerName, player2.teamName); // 한아름 호랑이
	}
}
