package edu.handong.csee.java.lab13.prob03; // the package.

/**
 * This is a subclass of Shapes class, Rectangle. 
 * @author Bigstar
 *
 */

public class Rectangle extends Shapes {

	private double length; // set the double variable. (length) this is a private type.
	private double width; // set the double variable. (width) this is a private type.
	/**
	 * This is a constructor.
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width)
	{
		this.length = length; // the this keyword. this length points itself.
		this.width = width; // the this keyword. this width points itself.
	}
	
    /**
    * This is a public method. </br>
    * This method return rectangle's area (double).
    */
	
	public double area() 
	{
		
		return length * width; // return the area of rectangle.
	}

	/**
	 * This is a public method, parimeter. </br>
	 * This method return rectangle's parimeter.
	 */
	public double parimeter() 
	{
		return 2*length + 2*width; // return the parimeter of rectangle.
	}
	/**
	 * This is a public method, getleng. </br>
	 * The method return length.
	 * @return
	 */
	public double getleng()
	{
		return length; // return double variable, length.
	}
	
	/**
	 * This is a public method, getwidth </br>
	 * The method return width.
	 * @return
	 */
	public double getwidth()
	{
		return width; // return double variable, width.
	}

}
