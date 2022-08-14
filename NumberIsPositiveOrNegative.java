package Problems;

public class NumberIsPositiveOrNegative {

	public static void main(String[] args) {

		int num = -36;// its is the number to check

		if (num > 0)// checking number is greater than zero
		{
			System.out.println("The number " + num + " is positive");
		} else {
			System.out.println("The number " + num + " is negative");
		}

		// Checking for odd or even
		if (num % 2 == 0) {
			System.out.println(num + " is Even number");
		} else {
			System.out.println(num + " is not Even number");
		}
	}

}
