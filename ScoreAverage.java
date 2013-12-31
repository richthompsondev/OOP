package class2;

import java.util.Scanner;

public class ScoreAverage {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insert the first grade.");		
		double score1 = insert(input);
		
		System.out.println("Insert the second grade.");	
		double score2 = insert(input);
		
		double average = (score1 + score2)/2;
		
		//ternary operator
		System.out.println((average>=7) ? "Average score "+average+", pass." : "Average score "+average+", fail.");
		input.close();
	}
	
	static double insert(Scanner input) {
		String score = input.next();
		//String to double casting - treatment for countries that use , instead of . as decimal separator. Could use DecimalFormat too.
		score = score.replace(",", ".");
		double scoreDouble = Double.parseDouble(score);
		return scoreDouble;
	}
}
