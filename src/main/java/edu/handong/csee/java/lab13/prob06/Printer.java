package edu.handong.csee.java.lab13.prob06; // the package.

/**
 * This is a public class, Printer. 
 * @author Administrator
 *
 */

public class Printer {

	/**
	 * This is a public static method, print. </br>
	 * The method has no return.
	 * @param object
	 */
	public static void print(Object object)
	{
		String s1 = object.toString(); // set the String instantiation, s1 to the return of toString method of object class.
		if(object instanceof CapitalPrint) // if you want to call to the instance of CapitalPrint class.
		{
			s1 = s1.toUpperCase(); // s1 is uppercase letters.
		}
		System.out.println(s1); // display the s1 String.
	}
}
