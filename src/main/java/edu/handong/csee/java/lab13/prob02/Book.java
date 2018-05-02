package edu.handong.csee.java.lab13.prob02; // the package.

/**
 * This is a super class, Book.
 * @author Bigstar
 *
 */
public class Book {

	static int Idcount; // set the static integer variable, Idcount.
	int Id; // set the integer variable, Id
	String bookname = ""; // set the String variable, bookname.
	/**
	 * This is a constructor.
	 * @param bookname
	 */
	public Book(String bookname)
	{
		this.bookname = bookname; // the this keyword. this bookname points itself.
		Idcount++; // Increase the Idcount variable 1.
		Id = Idcount; // set the Id value to the Idcount.
	}
	
	/**
	 * This is the public method, setName.
	 * @return 
	 */
	public String setName()
	{
		return "\n\t Id: " +Id + "\n\t Book Name : " + bookname; // return the parenthesis " Id : id \n Book Name : bookname "
	}
	
	/**
	 * This is a public method, showthebook. </br>
	 * When you call to this method, you will see the parenthesis and the value of setName method.
	 */
	public void showthebook()
	{
		System.out.println("<<<BOOK>>>" + this.setName()); // display the parenthesis " <<<Book>>>" and the return of the setName method.
	}
}
