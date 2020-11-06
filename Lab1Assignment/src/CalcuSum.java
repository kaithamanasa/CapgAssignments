
/**
 * Calculating sum of first n natural numbers which are divisible by 2 and 5
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class CalcuSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = ip.nextInt();
		int s = calculateSum(n);
		System.out.println(s);
	}

	/**
	 * Checks whether a number divisible by 3 or 5
	 * 
	 * @param number
	 * @return
	 */
	public static int calculateSum(int number) {
		int sum = 0;
		while (number > 0) {
			if (number % 3 == 0 || number % 5 == 0)
				sum = sum + number;
			number--;
		}
		return sum;
	}
}
