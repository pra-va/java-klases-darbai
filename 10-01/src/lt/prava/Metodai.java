package lt.prava;

import java.util.Arrays;
import java.util.Scanner;

public class Metodai {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
//		printSomething();
		
//		int intNumber = 10;
//		printSomething(intNumber);
//		
//		double doubleNumber = 12.56816;
//		printSomething(doubleNumber);
		
//		String[] names = {"Tomas", "Tedy", "Terry", "Torrin"};
//		printSomething(names);
		
		
		String[] trees = new String[3]; // Empty
		printSomething(makeTreesArray(trees));
		
		int[] treesHeight = new int [trees.length];
		printSomething(makeTreesArray(trees, treesHeight));

	}

	private static String[] makeTreesArray(String[] trees, int[] treesHeight) {
		System.out.println();
		String [] treesInfo = new String[trees.length];
		for (int i = 0 ; i < trees.length; i++) {
			System.out.println("Enter " + trees[i] + " height:");
			treesInfo[i] = trees[i] + " " + input.nextInt();
		}
		return treesInfo;
	}

	private static String[] makeTreesArray(String[] trees) {
		for (int i = 0 ; i < trees.length ; i++) {
			System.out.println("Enter tree name:");
			trees[i] = input.nextLine();
		}
		return trees;
	}

	private static void printSomething() {
		System.out.println("Hello, World!");
	}
	
	private static void printSomething(int intNumber) {
		System.out.println("Hello, World! " + intNumber);
	}
	
	private static void printSomething(double doubleNumber) {
		System.out.println("Hello, World! " + doubleNumber);
	}
	
	private static void printSomething(String[] names) {
		// First method to print array.
		/*
		 * System.out.println(Arrays.toString(names));
		 * 
		 * // Second method to print array. for (int i = 0 ; i < names.length; i++) {
		 * System.out.print(names[i] + " "); }
		 */
		
		// Third method to print array.
		System.out.println();
		for (String name : names) {
			System.out.print(name + " ");
		}
	}

	
	
	
	
	
	
	
	
	
	

}
