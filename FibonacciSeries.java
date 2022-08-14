package Problems;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10, f = 0, s = 1, sum;	
		System.out.println(f);// printing first number
		System.out.println(s);// printing first number

		for (int i = 2; i < n; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			sum = f + s;
			f = s;
			s = sum;	
			System.out.println(sum);
		}
	}
}
