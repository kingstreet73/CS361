/**
 * 
 */
package employee;

/**
 * @author Elijah Goldstein
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// DONE To complete
		//emp3.whoAmI() // prints ... PART TIME EMPLOYEE because ... of upcasting on pEmployee to Employee by making emp3 = pEmp1, so it gets the same attributes. Emp3 and pEmp1 have the same whoAmI method.
		// emp3.getHourlyRate(); // returns syntax error because ... getHourlyRate isn't apart of employee like whoAmI is. Need to upcast to put getHourlyRate ( ((PartTimeEmployee) emp3).getHourlyRate();).

		// DONE To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		// if (CONDITION) {
		// System.out.println("emp3 instance of part time employee"); // printed
		// } else {
		// }
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee");
			}
		else {
		}

		// Downcasting 1
		// DONE Uncomment and run the code
		// PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// DONE To complete
		// This instruction compiles / does not compile. - DOES NOT COMPILE
		// This instruction returns a ClassCastException at run time
 		// because ... - Employee is not a subclass to Part-Time employee. Code is attempting to cast an object to a subclass of which it is not an instance.
		// 
		
		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// DONE Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
