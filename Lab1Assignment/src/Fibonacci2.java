
/**
 * Creating fibonacci series using recursion.
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class Fibonacci2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Limit : ");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		fibo(a, b, n);
	}

	/**
	 * fibonacci using recursion
	 * 
	 * @param a1
	 * @param b1
	 * @param number
	 * @return
	 */
	public static int fibo(int a1, int b1, int number) {
		// TODO Auto-generated method stub
		if (number <= 2)
			return 1;
		else {
			int c = a1 + b1;
			a1 = b1;
			b1 = c;
			System.out.print(c + " ");
			number--;
			return fibo(a1, b1, number);
		}
	}

}
