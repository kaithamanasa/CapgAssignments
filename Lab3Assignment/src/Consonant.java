
/**
 * 
 * Problem:A Program to replace all the consonants with next letter.
 * @author MANASA KAITHA
 */
import java.util.Scanner;

public class Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated stub
		Scanner sc = new Scanner(System.in);
		// entering the string
		System.out.println("Enter the string");
		String input = sc.nextLine().toLowerCase();
		// altering the string
		String output = alterString(input);
		System.out.println(output);
	}

	public static String alterString(String in) {
		String fin = "";
		/**
		 * logic for returning the string and replacing it with all the consonants and
		 * next character
		 */
		for (int i = 0; i < in.length(); i++) {
			if (in.charAt(i) == 'a' || in.charAt(i) == 'e' || in.charAt(i) == 'i' || in.charAt(i) == 'o'
					|| in.charAt(i) == 'u')
				fin = fin + in.charAt(i);
			else {
				char c = in.charAt(i);
				int a = c;
				int b = a + 1;
				c = (char) b;
				fin = fin + c;
			}
		}
		return fin;
	}
}
