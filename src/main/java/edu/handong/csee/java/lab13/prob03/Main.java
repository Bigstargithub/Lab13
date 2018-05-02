package edu.handong.csee.java.lab13.prob03; // the package.
import java.util.Scanner; // get the Scanner class from the package java.util.

/**
 * This is a Main class. </br>
 * This class has main method. 
 * @author Bigstar
 *
 */
public class Main {
	
	
	/**
	 * This is a main method.
	 * @param args
	 */
	public static void main(String[] args)
	{
		double n1; // set the double variable.
		Scanner myscanner = new Scanner(System.in); // Prepares to read from the keyboard.
		System.out.printf("Enter radius: "); // display the parenthesis. "Enter radius: " 
		n1 = myscanner.nextDouble(); // input the double type number to the n1 variable.
		
		Circle c1 = new Circle(n1); // instantiation of Circle class.
		System.out.println("Radius: " + c1.get_radius()); // display the parenthesis, "Radius : " and the return of get_radius method.
		c1.display(); // call to the display method of Circle class.
		
		
		double n2; // set the double variable, n2.
		double n3; // set the double variable, n3.
		System.out.printf("Enter length and width: "); // display the parenthesis. "Enter the length and width: ".
		n2 = myscanner.nextDouble(); // input the double type number to the n2 variable. (length).
		n3 = myscanner.nextDouble(); // input the double type number to the n3 variable. (width).
		
		Rectangle r1 = new Rectangle(n2, n3); // instantiation of Rectangle class.
		System.out.println("Length: "+ r1.getleng()); // display the parenthesis. "Length: " and the return getleng method.
		System.out.println("Width: " + r1.getwidth());// display the parenthesis. "Width: " and the return getwidth method.
		r1.display(); // call to the display method of Rectangle class.
		
	}

}