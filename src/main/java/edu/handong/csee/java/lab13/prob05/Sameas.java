package edu.handong.csee.java.lab13.prob05;// the package.
import java.util.Scanner; // get the Scanner class from the package java.util.

/**
 * This is a public class, Sameas. </br>
 * The class will compare your arrays. </br>
 * When you put the two array, the class will compare your arrays whether two arrays are approximately identical or not.
 * @author Bigstar
 *
 */
public class Sameas {
	
	/**
	 * This is a public static method, equals. </br>
	 * The method returns true when two arrays are approximately identical or not. </br>
	 * If not, the method returns false.
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean equals(int[][] n1, int [][] n2)
	{
		int count = 0; // set the integer variable.
		if(n1.length != n2.length) // If the length of n1 is not same length of n2
		{
			return false; // return false.
		}	
		for(int i=0; i<n1.length;i++) // from 0 to (the length of n1 - 1)
		{
			for(int j=0; j<n1[i].length; j++) // from 0 to (the length of n1[i] -1)
			{
				if(n1[i][j] != n2[i][j]) // If the n1[i][j] is not same n2[i][j].
				{
				 count++; // increase 1 to the integer variable, count.
				}
			}
	    }
		
		if(count <=3) // if the integer variable(count) is 3 and less than 3
			return true; // return true.
			 else // if not,
			return false; // return false.
	}	
	
	/**
	 * This is a main method.
	 * @param args
	 */
	public static void main(String[] args)
	{
		int n1,n2,n3,n4; //set the integer variable, n1,n2,n3,n4.
		Scanner myscanner = new Scanner(System.in); // prepares to read from the keyboard.
		System.out.printf("Enter row size(maximum 5): "); // display the parenthesis, "Enter row size(maximum 5): ".
		n1 = myscanner.nextInt(); // input the integer number.
		System.out.printf("Enter column size(maximum 5): "); // display the parenthesis, "Enter column size(maximum 5): ".
		n2 = myscanner.nextInt(); // input the integer number.
		System.out.printf("Enter row size(maximum 5): "); // display the parenthesis, "Enter row size(maximum 5): ".
		n3 = myscanner.nextInt(); // input the integer number.
		System.out.printf("Enter column size(maximum 5): ");
		n4 = myscanner.nextInt(); // input the integer number.
		
		int[][] a1 = new int[n1][n2]; // set the integer array, a1.
		int[][] a2 = new int[n3][n4]; // set the integer array, a2.
		
		
		System.out.printf("Enter list1: "); // display the parenthesis, "Enter list1: ".
		for(int i=0; i<a1.length; i++) // from 0 to (the length of a1 - 1)
		{
		  for(int j=0;j<a1[i].length;j++) // from 0 to (the length of a1[i] -1)
		  {
			  a1[i][j] = myscanner.nextInt(); // input the integer number.
		  }
		}
		
		System.out.printf("Enter list2: "); // display the parenthesis, "Enter list2: ".
		for(int i=0; i<a2.length; i++) // from 0 to (the length of a2 - 1)
		{
		  for(int j=0;j<a2[i].length;j++) // from 0 to (the length of a2[i] -1)
		  {
			  a2[i][j] = myscanner.nextInt(); // input the integer number.
		  }
		}
		
		for(int i=0; i<a1.length; i++) // from 0 to (the length of a1 - 1)
		{
		  for(int j=0;j<a1[i].length;j++) // from 0 to (the length of a1[i] -1)
		  {
			  System.out.print(a1[i][j]+ " "); // display the array, a1.
		  }
		  System.out.print("\n"); // Line breaking.
		}
		
		System.out.print("\n"); // Line breaking.
		
		for(int i=0; i<a2.length; i++) // from 0 to (the length of a2 - 1)
		{
		  for(int j=0;j<a2[i].length;j++) // from 0 to (the length of a2[i] -1)
		  {
			  System.out.print(a2[i][j] + " "); // display the array, a2.
		  }
		  System.out.print("\n");// Line breaking
		}
		
		if(equals(a1,a2)) // if the equal method returns true,
			System.out.println("The two arrays are approximately identical."); // display the parenthesis, The two arrays are approximately identical.
		else // the equal method returns false,
			System.out.println("The two arrays are not identical"); // display the parenthesis, The two arrays are not identical.
	}

}
