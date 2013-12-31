package classes;
/*
 * Faça um programa que receba o nome e a idade de umas 5 pessoas 
 * e mostre o nome e a idade da pessoa mais nova e da pessoa mais velha.
 */
import java.util.Scanner;

public class OldestYoungest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("How many?");
		int n = input.nextInt();		
		String nameArray[] = new String[n];
		int ageArray[] = new int[n];
		
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println("Insert name and age.");
			nameArray[i] = input.next();
			ageArray[i] = input.nextInt();	
		}
		
		int oldestAge = ageArray[0], youngestAge = ageArray[0];
		String oldestAgeName = nameArray[0], youngestAgeName = nameArray[0];
		for (int i = 0; i < nameArray.length; i++) {
			if(ageArray[i] > oldestAge) {
				oldestAge = ageArray[i];
				oldestAgeName = nameArray[i];
			}
			if(ageArray[i] < youngestAge){
				youngestAge = ageArray[i];
				youngestAgeName = nameArray[i];
			}
		}
		
		System.out.println("The youngest person is " +youngestAgeName+", " +youngestAge+ " years old.");
		System.out.println("The oldest person is " +oldestAgeName+", " +oldestAge+ " years old.");

		input.close();
	}
}