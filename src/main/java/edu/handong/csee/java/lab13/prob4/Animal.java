package edu.handong.csee.java.lab13.prob4; // the package.

/**
 * This is a public class, Animal.
 * @author Bigstar
 *
 */

public class Animal
{
	public String name; // set the public String variable, name.
	/**
	 * This is a constructor.
	 * @param name
	 */
	public Animal(String name)
	{
		this.name = name; // the this keyword. this name points itself.
	}
	/**
	 * This is a public method, getname.
	 * The method doesn't return.
	 */
	public void getname()
	{
		System.out.println("Name: " + name); // display the parenthesis "Name: " and Animal's name.
	}

}
