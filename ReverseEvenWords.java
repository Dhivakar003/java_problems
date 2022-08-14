package Problems;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String str = "I am a software tester";// it is the string to reverse only even words
		String[] a = str.split(" ");
		String val = "";// initialize val with empty to store reverse words
		
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 1)
				val = val + new StringBuilder(a[i]).reverse() + " ";
			else
				val = val + a[i] + " ";
		}
		System.out.println(str);
		System.out.println("_________________________________");
		System.out.println("");
		System.out.println(val);
	}

}
