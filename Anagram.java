package Problems;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String x = "stops";// String literal
		String y = "potss";

		// Checking for the length of strings
		if (x.length() == y.length()) {
			System.out.println("length of the strings are same");
		} else {
			System.out.println("length of the strings are not same");
		}

		// Converting both the arrays to character array
		char a[] = x.toCharArray();
		Arrays.sort(a);
		char b[] = y.toCharArray();
		Arrays.sort(b);

		// Comparing both the arrays using in-built function equals ()
		boolean equals = Arrays.equals(a, b);
		if (equals == true) {
			System.out.println("Both the strings are Anagram");
		} else {
			System.out.println("Both the strings are not Anagram");
		}

	}
}
