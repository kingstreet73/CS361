/**
 * 
 */
package mystack;

/**
 * @author Elijah Goldstein
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// DONE To complete
		T pop1 = theStack.val;
		theStack = theStack.next;
		return pop1;
	}

	public void push(T v) {
		// DONE To complete
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// DONE To complete
		// Create a stack of Integer
		MyStack<Integer> a = new MyStack<Integer>();
		// Push 1 and 2
		a.push(1);
		a.push(2);
		// Pop
		a.pop();
		// Push 5
		a.push(5);
		
		// DONE To complete
		// Create a stack of Person
		MyStack<Person> p = new MyStack<Person>();
		// Push a person p1 with your name
		Person p1 = new Person("Elijah", "Goldstein");
		p.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person("Dr. Christelle", "Scharffe ");
		p.push(p2);
	}

}
