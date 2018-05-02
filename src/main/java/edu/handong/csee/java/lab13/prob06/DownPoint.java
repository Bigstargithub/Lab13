package edu.handong.csee.java.lab13.prob06; // the package.

/**
 * This is a public class, DownPoint. </br>
 * The method will return lowercase letters (x,y).
 * @author Bigstar
 *
 */
public class DownPoint {

	private int x; // set the private integer, x
	private int y; // set the private integer, y
	/**
	 * This is a constructor.
	 * @param x
	 * @param y
	 */
	public DownPoint(int x, int y) 
	{
		this.x = x; // the this keyword. this x points itself.
		this.y = y; // the this keyword. this y points itself.
	}
	/**
	 * This is a public String method, toString. </br>
	 * The method returns the lowercase letters.
	 */
	public String toString()
	{
		return ("x : " + x + " y : " + y); // return the parenthesis "x :   y : " and two integer variable, x and y.
	}
}
