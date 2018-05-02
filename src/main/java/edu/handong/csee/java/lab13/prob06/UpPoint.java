package edu.handong.csee.java.lab13.prob06; // the package

/**
 * This is a public class, UpPoint. </br>
 * The method will implement interface, CapitalPrint.
 * @author Bigstar.
 *
 */
public class UpPoint implements CapitalPrint {

	private int a; // set the private integer variable, a.
	private int b; // set the private integer variable, b.
	/**
	 * This is a constructor.
	 * @param a
	 * @param b
	 */
	public UpPoint(int a, int b)
	{
		this.a = a; // the this keyword. the a variable points itself.
		this.b = b; // the this keyword. the b variable points itself.
	}
	/**
	 * This is a public method, toString.
	 */
	public String toString()
	{
		return ("X : " + a + " Y : " + b); // return uppercase letter, (X,Y) and the integer variables (a and b)
	}
}
