/**
 * description: :  Validate the age of a person and display proper message
 *  by using user defined exception.
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class AgeException extends Exception{
	String str1;
	/**
	 * constructor for agecheckException class
	 * @param str2
	 */
	public AgeException(String str2) {
		str1=str2;
	   }
	/**
	 * Overriding the to string method.
	 */
	   public String toString(){ 
		return ("Exception Occurred: "+str1) ;
	   }
	   public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			// try block for checking age
			try
			{
				System.out.println("Enter Persons age: ");
				int  age=sc.nextInt();
				if(age<=15)//if age less then 50 then
				//throwing an exception 
					throw new FirstAndLastNameCheck("AGE is less than 15 not allowed-----");
				else//else the age valid
					System.out.println("Valid age");
			}
			/**
			 * catch block for catching exception.
			 */
			catch (FirstAndLastNameCheck e) {
				System.out.println(e.toString());
			}

		}

}
