
/**
 * problem: A java program to override equal method using employee class.
 * 
 * @author MANASA KAITHA
 *
 */

public class EqualOverride {
	/**
	 * Employee class attributes
	 * 
	 */
	private String employeeName;
	private int employeeId;

	EqualOverride(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	EqualOverride(int employeeId) {
		this.employeeId = employeeId;
	}

	EqualOverride(String employeeName) {
		this.employeeName = employeeName;
	}

	public static void main(String[] args) {
		/**
		 * objects of employee are created
		 * 
		 */
		EqualOverride eq = new EqualOverride(101, "Manasa");
		EqualOverride eq1 = new EqualOverride(102);
		EqualOverride eq2 = new EqualOverride("Manasa");
		EqualOverride eq3 = new EqualOverride(101, "Manasa");
		/**
		 * checks whether obj is equals or not
		 */
		if (eq.equals(eq3))
			System.out.println("The two objects eq and eq3 are equal");
		else
			System.out.println("Not equal");
		if (eq.equals(eq1))
			System.out.println("The two objects eq and eq1 are equal");
		else
			System.out.println("Not equal");
		if (eq.equals(eq2))
			System.out.println("The two objects eq and eq2 are equal");
		else
			System.out.println("Not equal");
	}

	public boolean equals(Object o) {
		/**
		 * Typecast object t into Employee's object
		 */
		EqualOverride t = (EqualOverride) o;
		return employeeName.equals(t.employeeName) && Integer.compare(employeeId, t.employeeId) == 0;
	}
}
