package edu.handong.csee.java.lab13.prob4; // the package.
import java.util.Scanner; // get the Scanner class from the package java.util.
/**
 * This is a public class, Master.
 * The master feeds the animals such as dog,cat etc.
 * @author Bigstar
 *
 */
public class Master {
	/**
	 * This is a public method, displayfeed.
	 * The method doesn't return.
	 * @param pet
	 */
	public void displayfeed(Pet pet)
	{
		System.out.println("feed: "+pet.feed()); // display the parenthesis, "feed: "  and the return of feed method of pet class.
	}

	/**
	 * This is a main method.
	 * @param args
	 */
	public static void main(String[] args)
	{
		String cname, dname; // set the String variable, cname, dname.
		Scanner myscanner = new Scanner(System.in); // Prepares to read from the keyboard.
		System.out.printf("Enter the cat name and dog name: "); // display the parenthesis, "Enter the cat name and dog name: ".
		cname = myscanner.next(); // input to the cat's name.
		dname = myscanner.next(); // input to the dog's name.
		
		Animal a1 = new Animal(cname); // instantiation of the Animal class, a1
		Cat c1 = new Cat(cname); // instantiation of the Cat class, c1
		Dog d1 = new Dog(dname); // instantiation of the Dog class, d1
		Master m1 = new Master(); // instantiation of the Master class, m1
		a1.getname(); // call to the method getname of the a1 instantiation.
		m1.displayfeed(c1); // call to the method displayfeed of the m1 instantiation with the parameter c1.
		
		Animal a2 = new Animal(dname); //  instantiation of the Animal class, a2
		a2.getname(); // call to the method getname of the a2 instantiation.
		m1.displayfeed(d1); // call to the method displayfeed of the m1 instantiation with the parameter d1.
		
		
	}
}
