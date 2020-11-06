
/**
 * Problem:Car Parking Management System
 * @author MANASA KAITHA
 *
 */
import java.util.Scanner;

public class CarParkingManagement {
	/**
	 * this variable contains owners name
	 * 
	 */
	private String name;
	/**
	 * this variable contains registration number
	 */
	private int registrartionNumber;

	public CarParkingManagement() {

	}

	public CarParkingManagement(String name, int registrationNumber) {
		/**
		 * this constructor initializes all the data members of car class
		 * 
		 */
		this.name = name;
		this.registrartionNumber = registrationNumber;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarParkingManagement arr[][] = new CarParkingManagement[5][];
		/**
		 * creating car parking slots.
		 * 
		 */
		arr[0] = new CarParkingManagement[1];
		arr[1] = new CarParkingManagement[7];
		arr[2] = new CarParkingManagement[5];
		arr[3] = new CarParkingManagement[2];
		arr[4] = new CarParkingManagement[10];
		do {
			/**
			 * to display the car parking details
			 * 
			 */
			System.out.println("1. Park Car");
			System.out.println("2. Get Car");
			System.out.println("3. Show Available Parking Slots");
			System.out.println("Enter you choice");
			int choice = sc.nextInt();
			switch (choice) {
			/**
			 * Creating car parking management object and assigning to the array.
			 * 
			 */
			case 1:
				System.out.println("Enter Owner name: ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter car registration no :");
				int rnumber = sc.nextInt();
				int counter = 0;
				CarParkingManagement cr = new CarParkingManagement(name, rnumber);
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j] == null) {
							arr[i][j] = cr;
							counter = 1;
							break;
						}
					}
					if (counter == 1)
						break;
				}
				break;
			/**
			 * finding the car as per registration number and removing from the array.
			 * 
			 */
			case 2:
				System.out.println("Enter the registered number:");
				int rnum = sc.nextInt();
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j] == null)
							continue;
						else {
							if (arr[i][j].registrartionNumber == rnum)
								arr[i][j] = null;
						}
					}
				}
				break;
			/**
			 * calculating the number parking slots left for car parking.
			 * 
			 */
			case 3:
				int count = 0;
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j] == null)
							count++;
					}
				}
				if (count == 0)
					System.out.println("Parking area is full");
				else
					System.out.println("Number of parking area available are: " + count);
				break;
			case 4:
				System.out.println("Thank you");
				System.exit(0);
			}
		} while (true);
	}
}
