package ch07.home.ex04.case01;

public class MaxMin {
	public static void main(String[] args) {
		int[] scores = {77, 88, 91, 33, 100, 55, 95};
		
		int max = scores[0];
		int min = scores[0];
		
		for(int score: scores) {
			if(max < score) max = score;
			if(min > score) min = score;
		}
		
		System.out.printf("%d %d", max, min);
	}
}
/*
과제: scores 에서 최고, 최소값을 찾아라.
*/