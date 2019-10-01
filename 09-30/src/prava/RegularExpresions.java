package prava;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RegularExpresions {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		recreate();

	}
	
	private static void recreate() {
		System.out.println("Type something:");
		String read = input.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(read);
		
		if (read.isEmpty()) {
			System.out.println("Empty line");
		} else {
			System.out.println("Not empty");
		}
		System.out.println(read);
	}

}
