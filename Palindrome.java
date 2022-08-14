package Problems;

public class Palindrome {

	public static void main(String[] args) {

		String a = "TeneT";// String literal
		String rev = "";// Initializing an empty string to store the reverse

		for (int i = a.length() - 1; i >= 0; i--)// iterating in reverse order
		{
			rev = rev + a.charAt(i);
			System.out.println(rev);
		}

		if (a.equals(rev)) // checking if both the strings are equal
		{
			System.out.println("is palindrom");
		} else {
			System.out.println("is not palindrome");
		}

	}

}
