package edu.handong.csee.java.lab13.prob02; // the package.

/**
 * This is a main class. </br>
 * this class has main method.
 * @author Administrator
 *
 */
public class MAIN {

	/**
	 * This is a main method.
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		Book b1 = new Book("Simple Book"); // instantiation of Book class. b1.
		Science s1 = new Science("Hello Physics!", "ScienceWorld"); // instantiation of Science class. s1.
		History h1 = new History("What Is history?", "E.H.Carr"); // instantiation of History class. h1
		History h2 = new History("The South Korea", "Judis");// instantiation of History class. h2
		
		b1.showthebook(); // call to the showthebook method in the book class. b1
 		s1.showthebook(); // call to the showthebook method in the Science class. s1
		h1.showthebook(); // call to the showthebook method in the History class. h1
		h2.showthebook(); // call to the showthebook method in the History class. h2
	}
}
