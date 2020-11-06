
/**
 * Problem: A program which reads line of integer and displays each integer and sum of all integers.
 * @author KAITHA MANASA
 *
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the series of integer:");
		String number = sc.nextLine();
		/**
		 * String tokenizer for sorting strings characters in series.
		 * 
		 */
		StringTokenizer st = new StringTokenizer(number, " ");
		int sum = 0;
		while (st.hasMoreElements()) {
			/**
			 * checking and converting each token to integer.
			 * 
			 */
			String i = st.nextToken().toString();

			System.out.println(i);
			/**
			 * adding the array of string elements by parsing them into integer
			 * 
			 */
			sum = sum + Integer.parseInt(i);
		}
		System.out.println(sum);
	}

}
