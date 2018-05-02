package edu.handong.csee.java.lab13.prob4;

/**
 * This is a subclass of Animal class, Dog.
 * The method implements the interface, Pet
 * @author Administrator
 *
 */
public class Dog extends Animal implements Pet 
{
   /**
   * This is a constructor.
   * @param name
   */
	public Dog(String name) {
		super(name); // call to the super class.
	}

	/**
	 * This is a public method, feed.
	 * The method returns String variable.
	 */
	public String feed() {
		
		return ("(Dog!)Sausage"); // display the parenthesis, (Dog!)Sausage.
	}

}
