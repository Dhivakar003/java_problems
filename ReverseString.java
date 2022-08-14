package Problems;

public class ReverseString {
	public static void main(String[] args) {

		String a = "origin", rev = "";
		System.out.println("Original word : " + a);

		for (int i = a.length() - 1; i >= 0; i--) // iterating in reverse order
		{
			char x = a.charAt(i); //returns the character in reverse index
			rev = rev + x;
		}
		System.out.println("Reversed word : " + rev);
	}

}
