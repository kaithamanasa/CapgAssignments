/**
 * Problem: Checking whether the number is an increasing number
 * @author MANASA KAITHA
 *
 */
import java.util.*;

public class CheckNumber {
	//TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		boolean check=checkNumber(number);
		if(check==true)
			System.out.println(number+" is an increasing number");
		else
			System.out.println(number+" is not an increasing number");

	}
	/** 
	 * checks whether a number increases or not
	 * @param n
	 * @return
	 */
	public static boolean checkNumber(int n) {
		int count=0;
		while(n>0) {
			int i=n%10;
			n=n/10;
			if(i>=(n%10))
				continue;
			else
				count++;
		}
		if(count==0)
			return true;
		else
			return false;
	}

}
