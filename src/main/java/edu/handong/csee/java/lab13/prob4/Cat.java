package edu.handong.csee.java.lab13.prob4; // the package.

/**
 * This is a subclass of Animal class.
 * The class will implement a Pet Class.
 * @author Bigstar
 *
 */

public class Cat extends Animal implements Pet 
{

	/**
	 * This is a constructor of cat class.
	 * @param name
	 */
	public Cat(String name) {
		super(name); // call to the super class.
	}

	/**
	 * This is a public String method, feed.
	 */
	public String feed()
	{
		return ("(Cat!)Fish"); // return the parenthesis, (Cat!)Fish.
	}

}
