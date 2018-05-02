package edu.handong.csee.java.lab13.prob06; // the package.

/**
 * This is a public class, Main.
 *  
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
		UpPoint p1 = new UpPoint(3,3); // instantiation of UpPoint class, p1.
		DownPoint p2 = new DownPoint(2,5); // instantiation of DownPoint class, p2.
		DownPoint p3 = new DownPoint(4,7); // instantiation of DownPoint class, p3.
		UpPoint p4 = new UpPoint(9,12); // instantiation of UpPoint class, p4.
		Printer.print(p1); // call to the print method in the Printer class. the parameter is p1 instantiation.
		Printer.print(p2); // call to the print method in the Printer class. the parameter is p2 instantiation.
		Printer.print(p3); // call to the print method in the Printer class. the parameter is p3 instantiation.
		Printer.print(p4); // call to the print method in the Printer class. the parameter is p4 instantiation.
	}

}
