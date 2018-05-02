package edu.handong.csee.java.lab13.prob02; // the package.

/**
 * This is a subclass of Book class. </br>
 * you can define History book's author.
 * @author Administrator
 *
 */
public class History extends Book {

	private String author = ""; // set the String variable, author.
	/**
	 * This is a constructor of History.
	 * @param bookname
	 * @param author
	 */
	public History(String bookname, String author) 
	{
		
		super(bookname); // call to the superclass.
		this.author = author; // the this keyword. this author points itself.
	}
	
	/**
	 * This is a public method, setName. the return type is String. </br>
	 * This is a Overriding.
	 */
	public String setName()
	{
		return super.setName() + "\n\t Author : " + this.author; // return the setName method of super class and the parenthesis.
	}
	
	/**
	 * This is a public method, showthebook.
	 */
	public void showthebook()
	{
		System.out.println("<<<History>>>" + this.setName()); // display the parenthesis and perform the setName method.
	}

}
