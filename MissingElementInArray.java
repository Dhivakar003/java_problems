
package Problems;

public class MissingElementInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 7, 8 };
		int n = a.length + 1;// the actual size since a number is missing from the array
		int totalsum = n * (n + 1) / 2;// sum of total integers in the array
		int sum = 0;

		for (int i = 0; i < a.length; i++)// iterating to get actual sum of integers in the array
		{
			sum = sum + a[i];
		}
		System.out.println("Total sum in an array is" + " " + sum);
		System.out.println("missing number in an array is" + " " + (totalsum - sum));
	}
}