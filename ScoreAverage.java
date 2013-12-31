package class2;

import java.util.Scanner;

public class ScoreAverage {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//String to double casting - treatment for countries that use , instead of . as decimal separator
		System.out.println("Insert the first grade.");
		String input1 = input.next();
		input1 = input1.replace(",", ".");
		double score1 = Double.parseDouble(input1);
		
		System.out.println("Insert the second grade.");
		String input2 = input.next();
		input2 = input2.replace(",", ".");
		double score2 = Double.parseDouble(input2);
		
		double average = (score1 + score2)/2;
		
		//ternary operator
		System.out.println((average>=7) ? "Average score "+average+", pass." : "Average score "+average+", fail.");
		input.close();
	}
}
