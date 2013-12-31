package class2;

import java.util.Scanner;

public class ArrayQuery {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert the number of elements");
		int n = input.nextInt();
		int array[] = new int[n];
		insert(array, input); //Insertion into vector part
		search(array, input); //Query in vector part
		sort(array); //Vector sort part
		input.close();
	}
	
	static void insert(int[] array, Scanner input) {
		for(int i = 0; i < array.length; i++) { 
			System.out.println("Insert the element "+(i+1));
			array[i] = input.nextInt();
		}
	}
	//Could be binary search
	static void search(int[] array, Scanner input) {
		boolean exist = false;
		System.out.println("Search?");
		int query = input.nextInt();
		for(int i=0; i<array.length; i++){ 
			if(array[i]==query) {
				int mod100 = (i+1) % 100;
			    int mod10 = (i+1) % 10;
				if(mod10 == 1 && mod100 != 11)
					System.out.println("Found in the "+(i+1)+"st position.");
				else if(mod10 == 2 && mod100 != 12)
					System.out.println("Found in the "+(i+1)+"nd position.");
				else if(mod10 == 3 && mod100 != 13)
					System.out.println("Found in the "+(i+1)+"rd position.");
				else
					System.out.println("Found in the "+(i+1)+"th position.");
				exist = true;
			}
		}
		if(!exist)
			System.out.println("Not found.");
	}
	//Could use Array.sort()
	static void sort(int[] array) {
		int sorter = 0;
		for(int i=0; i<array.length; i++){ 
			if(sorter<=array[i]) {
				sorter = array[i];
				if((i+1)==array.length)
					System.out.println("The numbers are in ascending order.");
				continue;
			}
			else {
				System.out.println("The numbers are not in ascending order. Reordering them:");
				quicksort(array, 0, array.length-1);
				for(i=0; i<array.length; i++)
					System.out.println(array[i]);
				break;
			}

		}
	}
	
	private static void quicksort(int[] array, int left, int right) {
		if(left<right) {
			int j = separate(array, left, right);//Pivot
			quicksort(array, left, j-1);//Sort recursively from left to pivot
			quicksort(array, j+1, right);//Sort recursively from pivot to right
		}
	}

	private static int separate(int[] array, int left, int right) {
		int i = left+1;
		int j = right;
		int pivot = array[left];
		while(i<=j) {
			if(array[i]<=pivot)
				i++;
			else if(array[j]>pivot)
				j--;
			else if(i<=j) {
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
