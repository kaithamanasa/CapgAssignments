
/**
 * Java program that method to check if a number is a power of two or not
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class Checknumber2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		boolean check = checkNumber(n);
		if (check == true)
			System.out.println(n + " is a power of 2");
		else
			System.out.println(n + " is not a power of 2");

	}

	/**
	 * checks whether a number is power of two
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkNumber(int number) {
		int i = 2;
		while (i < number) {
			i = i * 2;
		}
		if (i == number)
			return true;
		else
			return false;
	}

}
