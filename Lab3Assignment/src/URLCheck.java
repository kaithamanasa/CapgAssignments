
/**
 * Problem:printing the command in URL.
 * @author KAITHA MANASA
 *
 */
import java.util.Scanner;

public class URLCheck {

	public static void main(String[] args) {
//TODO Auto generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url:");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		/**
		 * reversing the string using string buffer
		 * 
		 */
		sb.reverse();
		s = sb.toString();
		String result = "";
		int i = 0;
		while (i < s.length()) {
			/**
			 * checking for the "."
			 * 
			 */
			if (s.charAt(i) == '.') {
				i = i + 1;
				/**
				 * traversing till we get "/".
				 * 
				 */
				while (s.charAt(i) != '/') {
					result = result + s.charAt(i);
					i++;
				}
				break;
			}
			i++;
		}
		String fn = "";
		for (int k = result.length() - 1; k >= 0; k--)
			fn = fn + result.charAt(k);
		System.out.println(fn);
	}

}