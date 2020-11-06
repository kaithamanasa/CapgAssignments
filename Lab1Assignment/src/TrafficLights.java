
/**
 * Problem on traffic lights management
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class TrafficLights {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("-----Select the traffic light----");
		System.out.println("1.Red");
		System.out.println("3.Yellow");
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your choice : ");
		/**
		 * Display text according to the color of the traffic light
		 */
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("\n STOP");
		}
		if (choice == 2) {
			System.out.println("\nGo");
		}
		if (choice == 3) {
			System.out.println("\n1READY");
		}
	}

}
