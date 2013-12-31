package classes;
/*
 * 1) Faça um programa que peça ao usuário para entrar com 7 números inteiros e armazene-os em um vetor. 
 * Peça também para ele entrar com outro número inteiro X e determine se X está no vetor e em que posição.
 * 2) Considerando o vetor da questão anterior, verifique se os números estão em ordem crescente. 
 * Caso contrário, ordene e imprima o vetor.
 */
import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

public class ArrayQuery {
	// private static Scanner input;

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("Insert the number of elements");
				int n = readKey();
				int array[] = new int[n];
				insert(array); // Insertion into vector part
				search(array); // Query in vector part
				sort(array); // Vector sort part

				break;
			} catch (NumberFormatException e) {
				System.err.println("Invalid value");
			} catch (Exception e) {
				System.err.println("Something went wrong: " + e/*.getMessage()*/);
			}
		}
	}

	public static int readKey() throws NumberFormatException, InvalidAttributeValueException {
		Scanner input = new Scanner(System.in);
		return Integer.parseInt(input.nextLine());
	}

	static void insert(int[] array) throws NumberFormatException, InvalidAttributeValueException {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Insert the element " + (i + 1));
			array[i] = readKey();
		}
	}

	// Could be binary search
	static void search(int[] array)
			throws ArrayIndexOutOfBoundsException, NumberFormatException, InvalidAttributeValueException {
		boolean exist = false;
		System.out.println("Search?");
		int query = readKey();
		// linear search
		for (int i = 0; i < array.length; i++) {
			if (array[i] == query) {
				int mod100 = (i + 1) % 100;
				int mod10 = (i + 1) % 10;
				if (mod10 == 1 && mod100 != 11)
					System.out.println("Found in the " + (i + 1) + "st position.");
				else if (mod10 == 2 && mod100 != 12)
					System.out.println("Found in the " + (i + 1) + "nd position.");
				else if (mod10 == 3 && mod100 != 13)
					System.out.println("Found in the " + (i + 1) + "rd position.");
				else
					System.out.println("Found in the " + (i + 1) + "th position.");
				exist = true;
			}
		}
		if (!exist)
			System.out.println("Not found.");
	}

	// Could use Arrays.sort()
	static void sort(int[] array) {
		int sorter = 0;
		for (int i = 0; i < array.length; i++) {
			if (sorter <= array[i]) {
				sorter = array[i];
				if ((i + 1) == array.length)
					System.out.println("The numbers are in ascending order.");
				continue;
			} else {
				System.out.println("The numbers are not in ascending order. Reordering them:");
				quicksort(array, 0, array.length - 1);
				/*
				 * for(i=0; i<array.length-1; i++){ if(array[i]>array[i+1]) { sorter = array[i];
				 * array[i]=array[i+1]; array[i+1]=sorter; } }
				 */
				for (i = 0; i < array.length; i++)
					System.out.print(array[i]+" ");
				break;
			}

		}
	}

	private static void quicksort(int[] array, int left, int right) {
		if (left < right) {
			int j = separate(array, left, right);// Pivot
			quicksort(array, left, j - 1);// Sort recursively from left to pivot
			quicksort(array, j + 1, right);// Sort recursively from pivot to right
		}
	}

	private static int separate(int[] array, int left, int right) {
		int i = left + 1;
		int j = right;
		int pivot = array[left];
		while (i <= j) {
			if (array[i] <= pivot)
				i++;
			else if (array[j] > pivot)
				j--;
			else if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
		}
		swap(array, left, j);
		return j;
	}

	private static void swap(int[] array, int i, int j) {
		array[i] = (array[i] + array[j]) - (array[j] = array[i]);
	}

}
/*
 * //Java Program to find first and last //digits of a number import
 * java.util.*; import java.lang.*;
 * 
 * public class GfG{
 * 
 * // Find the first digit public static int firstDigit(int n) { // Remove last
 * digit from number // till only one digit is left while (n >= 10) n /= 10;
 * 
 * // return the first digit return n; }
 * 
 * // Find the last digit public static int lastDigit(int n) { // return the
 * last digit return (n % 10); }
 * 
 * // driver function public static void main(String argc[]) { int n = 98562;
 * System.out.println(firstDigit(n) + " " + lastDigit(n)); } }
 */