package edu.handong.csee.java.lab13.prob03;// the package.

/**
 * This is a subclass of Shape class.
 * @author Bigstar
 *
 */
public class Circle extends Shapes {

	private double radius; // set the double variable, radius.
	/**
	 * This is a constructor of Circle class.
	 * @param r
	 */
	public Circle(double r)
	{
		radius = r; // set the radius (double variable).
	}
	/**
	 * This is a public method, area. </br>
	 * The method returns the area of the circle.
	 */
	public double area() 
	{
		return Math.PI* Math.pow(radius,2); // return the area of the circle.
	}

	/**
	 * This is a public method, parameter. </br>
	 * The method returns the parimeter of the circle.
	 */
	public double parimeter()
	{
		return 2*Math.PI*radius; // return the parimeter of the circle.
	}
	
	/**
	 * This is a public method, get_radius. </br>
	 * The method returns radius (double variable.)
	 * @return
	 */
	public double get_radius()
	{
		return radius; // returns the double variable (radius).
	}

}
