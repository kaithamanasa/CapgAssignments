
/**
 * problem: sorting the alphabet where the first half is in upper case and second half is in lower.
 * @author MANASA KAITHA
 *
 */
import java.util.Arrays;

public class AlphabetSort {
	/**
	 * TODO auto-generated stub
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * declaring the string and sorting the string
		 * 
		 */
		String alphabets[] = new String[] { "a", "n", "b", "e", "c", "g", "m", "h", "y", "x", "z" };
		String result[] = sortStrings(alphabets);
		System.out.println(Arrays.toString(result));
	}

	public static String[] sortStrings(String alpha[]) {
		for (int i = 0; i < alpha.length; i++) {
			/**
			 * sorting the array in alphabetic order using bubble sort technique.
			 * 
			 */
			for (int j = i + 1; j < alpha.length; j++) {
				if (alpha[i].compareTo(alpha[j]) > 0) {
					String t = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = t;
				}
			}
			/**
			 * checking condition for converting first half to lower till(n/2)+1 if n is odd
			 * 
			 */
			if (i <= (alpha.length / 2) && alpha.length % 2 != 0)
				alpha[i] = alpha[i].toUpperCase();
			else
			/**
			 * checking condition for converting first half to lower till(n/2)+1 if n is odd
			 * 
			 */
			if (i < (alpha.length / 2) && alpha.length % 2 == 0)
				alpha[i] = alpha[i].toUpperCase();
		}
		return alpha;

	}
}
