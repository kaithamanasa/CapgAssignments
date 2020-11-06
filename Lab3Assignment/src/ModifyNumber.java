
/**
 * Problem: Program to modify the input number.
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class ModifyNumber {
// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int result = modifyNumber(number);
		System.out.println(result);
	}

	/**
	 * It generates a new number containing difference of each consecutive digit
	 * difference and unit digit is left as it is
	 * 
	 * @param num
	 * @return
	 */

	public static int modifyNumber(int num) {
		String t = Integer.toString(num);
		/**
		 * converts given number into string buffer
		 * 
		 */
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < t.length() - 1; i++) {
			/**
			 * finding the diff of the characters
			 */
			int a = Character.getNumericValue(t.charAt(i));
			int b = Character.getNumericValue(t.charAt(i + 1));
			int dif = Math.abs(a - b);
			sb.append(dif);
		}
		/**
		 * appending the characters in the string buffer
		 */
		sb.append(t.charAt(t.length() - 1));
		String fin = sb.toString();
		int rfin = Integer.parseInt(fin);
		return rfin;
	}
}
