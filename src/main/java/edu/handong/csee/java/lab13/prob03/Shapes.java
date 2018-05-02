package edu.handong.csee.java.lab13.prob03; // the package.
/**
 * This is a abstract class, Shape.
 * @author Administrator
 *
 */
public abstract class Shapes {

	public abstract double area(); // set the public abstract double method, area.
	public abstract double parimeter(); // set the public abstract double method, parimeter.
	/**
	 * This is a public method, display. </br>
	 * The method doesn't return.
	 */
	public void display() 
	{
		System.out.println("Area: " + area() + "\nPerimeter: "
				+ parimeter()+ "\n"); // display the parenthesis and the returns of area and parimeter. 
	}
	
}
