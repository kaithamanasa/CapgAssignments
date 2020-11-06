
/**
 *  Problem: A program to display number characters,line and words in a text.
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class Count {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int lines = 0;
		while (sc.hasNextLine()) {
			lines++;
			String line = sc.nextLine();
			sb.append(" " + line);
			if (line != null && line.isEmpty()) {
				break;
			}
		}
		String mstring = sb.toString().trim();
		int character = 0, words = 0;
		for (int i = 0; i < mstring.length(); i++) {
			if ((mstring.charAt(i) >= 'a' && mstring.charAt(i) <= 'z')
					|| (mstring.charAt(i) >= 'A' && mstring.charAt(i) <= 'Z')) {
				character++;
			}
			if (mstring.charAt(i) == ' ')
				words++;
		}
		/**
		 * displays the count of characters words and lines
		 */
		System.out.println("Lines= " + (lines - 1));
		System.out.println("Characters= " + character);
		System.out.println("Words= " + words);
	}

}
