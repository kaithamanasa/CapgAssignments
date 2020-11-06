
/**
 * Problem creating fibonaci without Recursion
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Limit : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s1 = 0, s2 = 1;
		System.out.print(s1 + " " + s2 + " ");
		int i = 0;
		/**
		 * Fibonaci without recursion
		 * 
		 */
		while (i < n) {
			int c = s1 + s2;
			System.out.print(c + " ");
			s1 = s2;
			s2 = c;
			i++;
		}
	}

}
