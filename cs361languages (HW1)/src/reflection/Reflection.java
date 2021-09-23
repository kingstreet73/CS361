/**
 * 
 */
package reflection;

/**
 * @author Elijah Goldstein
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;
import java.util.Arrays;

import circle.ColoredCircle;
import mystack.Person;


public class Reflection {
 
	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		// DONE To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		System.out.println("Inheritance chain: " + o.getClass() + " -> " + o.getClass().getSuperclass());
		}

	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// DONE To complete
		// Print each method on one line
		// Use this EXACT format
	
		System.out.println(Arrays.toString(m)+ "\n");
		}


	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an object of type String
		// DONE To complete
		Person p1 = new Person("Testing", "123");
	
		r.correspondingClass(p1);
		r.inheritanceChain(p1);
		r.listMethods(p1);
		
		// Demonstration of the methods on an object of type ColoredCircle
		// DONE To complete		
		ColoredCircle c1 = new ColoredCircle();
		r.correspondingClass(c1);
		r.inheritanceChain(c1);
		r.listMethods(c1);
	
	}
}
