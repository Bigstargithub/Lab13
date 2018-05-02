package edu.handong.csee.java.lab13.prob02; // the package.

/**
 * This is a subclass of Book class.
 * @author Bigstar
 *
 */

public class Science extends Book{

	private String Publisher = ""; // set the String variable, Publisher.
	
	/**
	 * This is a constructor.
	 * @param bookname
	 * @param Publisher
	 */
	
	public Science(String bookname, String Publisher) 
	{		
		super(bookname); // call to the superclass.
        this.Publisher = Publisher; // the this keyword. this Publisher points itself.
	}

	/**
	 * This is a public method, setName. </br>
	 * The method returns String types.
	 */
	
	public String setName()
	{
		return super.setName() + "\n\t Publisher: " + Publisher; // return setName method of super class and the parenthesis.
	}
	
    /**
     * This is a public method, showthebook. </br>
     * This method doesn't return
     */
	
	public void showthebook()
	{
		System.out.println("<<<Science>>>" + this.setName()); // return the parenthesis("<<<Science>>>") and the return of the setName method.
	}
	
}
