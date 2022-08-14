package Problems;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String str = "We learn java basics as part of java sessions in java last week";
		String[] a = str.split(" ");// splitting each word in a string into array

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j]))// condition to check similar words
				{
					a[j] = "";// changing the similar word to empty
				}
			}
		}
		for (int i = 0; i < a.length; i++) // iterating again to print
		{
			System.out.print(a[i] + " ");
		}
	}
}
