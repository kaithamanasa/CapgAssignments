
/**
 * Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order
 * @author MANASA KAITHA
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// calling the method
		int result[] = getSorted(arr);
		System.out.println(Arrays.toString(result));
	}

	public static int[] getSorted(int arr1[]) {
		/**
		 * converting the integer array to string by replacing \\s
		 */
		String temp = Arrays.toString(arr1).replaceAll("\\s", "");
		temp = temp.substring(1, temp.length() - 1);
		/**
		 * discarding "[,]" at atsrt and end using substring.
		 */
		StringBuilder sb = new StringBuilder(temp);
		sb.reverse();// reversing the array
		temp = sb.toString();
		String s1[] = temp.split(",");// creating string array by using split method.
		int fina[] = new int[s1.length];
		for (int i = 0; i < s1.length; i++)
			fina[i] = Integer.parseInt(s1[i]);// converting string array by using split method.
		for (int i = 0; i < fina.length; i++) {// sorting the array in ascending order using bubble sort technique.
			for (int j = i + 1; j < fina.length; j++) {
				if (fina[i] > fina[j]) {
					int t = fina[i];
					fina[i] = fina[j];
					fina[j] = t;

				}
			}
		}
		return fina;
	}
}
