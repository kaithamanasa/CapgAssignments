/**
 * Creating method which accepts an array of integer elements and return the
 * second smallest element in an array
 * 
 * @author MANASA KAITHA
 *
 */
public class SecondsmallestNumber {
	// TODO Auto-generated method stub
	public static int getSecondSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		/**
		 * 2nd element because index starts from 0
		 * 
		 */

		return a[1];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second smallest: " + getSecondSmallest(a, 6));
		System.out.println("Second smallest: " + getSecondSmallest(b, 7));
	}

}
