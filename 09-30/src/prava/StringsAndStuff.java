package prava;
import java.util.Arrays;
import java.util.regex.*;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringsAndStuff {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
//		compareStrings();
//		split();
//		characters();
//		substring();
//		contains();
//		concat();
//		joinString();
//		valueOfString();
//		stringTokenizer();
		recreate();

	}
	
	
	
	private static void recreate() {
		System.out.println("Type something:");
		String read = input.next();
		
		if (!read.isEmpty()) {
			System.out.println(read);
		}
	}



	private static void compareStrings() {
		System.out.println("Input name:");
		String  result = input.next().toLowerCase();
		System.out.println(result.equals("Tomas".toLowerCase()));
		String name = null;
		System.out.println(result.equals(name));
		String str1 = "Taki";
		String str2 = "TAKI";
		System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
		// Lokalizacija!!!
	}
	
	private static void split() {
		String naujas = "Ateina eziukas i miska..";
		String[] strArr = naujas.trim().split(" ");
		System.out.println(Arrays.toString(strArr));
	}
	
	private static void characters() {
		String text = "      Ateina eziukas i miska...    ";
		System.out.println(text.charAt(9));
		System.out.println(text.replace('i', 'o'));
	}
	
	private static void substring() {
		String text = "      Ateina eziukas i miska...    ";
		System.out.println(text);
		System.out.println(text.substring(9, 15));
	}
	
	private static void contains() {
		String text = "      Ateina eziukas i miska...    ";
		System.out.println(text);
		System.out.println(text.contains("eziukas"));
// 		System.out.println(text.matches("??is")); // ??????
	}
	
	private static void concatString() {
		String text = "      Ateina eziukas i miska...    ";
		System.out.println(text);
		System.out.println(text.concat(", new string"));
	}
	
	private static void joinString() {
		String[] names = {"Tadas", "Tomas", "Eddison"};
		String singleString = String.join(", ", names);
		System.out.println(singleString);
		
		StringJoiner joiner = new StringJoiner(", ");
		
	}
	
	private static void valueOfString() {
		String text = "      Ateina eziukas i miska...    ";
		System.out.println(text.valueOf(text)); //  Grazina objekto string reprezentatyvine reiksme
		int number = 12;
		String text2 = String.valueOf(number);
		System.out.println(text2 instanceof String);
	}
	
	private static void stringTokenizer() {
		String text = "Little text for String Tokenizer.";
		StringTokenizer tokens = new StringTokenizer(text);
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
	}
}









