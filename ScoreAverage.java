package classes;

import javax.swing.JOptionPane;

public class ScoreAverage {
	
	public static void main(String[] args) {
		int numberScores = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the number scores."));
		double scores[] = new double[numberScores], average = 0;
		
		for (int i = 0; i < scores.length; i++) {
			int mod100 = (i+1) % 100;
		    int mod10 = (i+1) % 10;
			if(mod10 == 1 && mod100 != 11)
				scores[i] = insert(JOptionPane.showInputDialog(null, "Insert the " + (i+1) + "st grade."));
			else if(mod10 == 2 && mod100 != 12)
				scores[i] = insert(JOptionPane.showInputDialog(null, "Insert the " + (i+1) + "nd grade."));
			else if(mod10 == 3 && mod100 != 13)
				scores[i] = insert(JOptionPane.showInputDialog(null, "Insert the " + (i+1) + "rd grade."));
			else
				scores[i] = insert(JOptionPane.showInputDialog(null, "Insert the " + (i+1) + "th grade."));
			average += scores[i];
		}
		average = average/numberScores;
		
		//ternary operator
		JOptionPane.showMessageDialog(null, (average>=7) ? "Average score is "+average+", pass." : "Average score is "+average+", fail.");

	}
	//String to double casting - treatment for countries that use , instead of . as decimal separator. Could use DecimalFormat too.
	static double insert(String score) {
		double scoreDouble = Double.parseDouble(score.replace(",", "."));
		return scoreDouble;
	}
}
