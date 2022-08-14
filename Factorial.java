package Problems;

public class Factorial {

	public static void main(String[] args) {

		int n = 5;//It is the number to calculate factorial   
		int fact = 1;

		for (int i = 1; i <= n; i++)
		{
			fact = fact * i;		
		}
		System.out.println("Factorial of 5 is :"+" "+fact);
	}

}
