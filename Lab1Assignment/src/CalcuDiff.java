
/**
 *Java program with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class CalcuDiff {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = calculateDifference(n);
		System.out.println(sum);
	}

	/**
	 * Calculates difference of sum of squares of a number and square of sum of
	 * square
	 */
	public static int calculateDifference(int number) {
		// TODO Auto generated method stub
		int s = 0;
		int square_sum = 0, sum_square = 0;
		while (number > 0) {
			square_sum = square_sum + (number * number);
			sum_square = sum_square + number;
			number--;
		}
		s = (sum_square * sum_square) - square_sum;
		return s;
	}
}
