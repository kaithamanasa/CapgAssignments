
/**
 * problem: A Program to create mirror image of the input string.
 * @author KAITHA MANASA
 */
import java.util.Scanner;

public class StringMirror {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String input = sc.nextLine();
		/**
		 * creating the mirror image of the string
		 */
		String result = getImage(input);
		System.out.println(result);
	}

	public static String getImage(String s) {
		StringBuffer str = new StringBuffer(s);
		str = str.reverse();
		s = s + "|" + str.toString();
		return s;
	}

}
