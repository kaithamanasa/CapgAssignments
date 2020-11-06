
/**
 * problem: Finding out of the sum of cubes of a number.
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class Cubesum {
	public static void main(String[] args) {
		// TODO Auto generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int sum_result = sumOfCube(number);
		System.out.println(sum_result);

	}

	/**
	 * generates digit for a number
	 * 
	 * @param num
	 * @return
	 */
	public static int sumOfCube(int num) {
		int rsum = 0;
		while (num > 0) {
			int i = num % 10;
			/**
			 * generates sum of the cubes of the digits
			 */
			rsum = rsum + (i * i * i);
			num = num / 10;
		}
		return rsum;
	}

}
