
/**
 * Printing Prime number up to user input number
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class PrimeNumber {
//TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			int primecount = 0;
			int k = 2;
			/**
			 * checks whether prime or not
			 * 
			 */
			while (k < n) {
				if (i % k == 0)
					primecount++;
				k++;
			}
			if (primecount == 1)
				System.out.print(i + " ");
		}
	}
}
