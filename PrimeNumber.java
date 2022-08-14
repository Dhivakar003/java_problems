package Problems;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 13;// it is the number to be checked
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)// condition for non prime number
			{
				prime = false;
				break;
			}
		}
		if (prime)//check value true or false, if prime is true then number is prime otherwise not prime 
		{
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not prime");
		}
	}
}
