package edu.handong.csee.java.lab13.prob01; // the package.

/**
 * This is a School class. </br>
 * This class will perform main method.
 * @author Bigstar
 *
 */
public class School {

	/**
	 * This is a main method.
	 * @param args
	 */
	public static void main(String[] args)
	{
		Friend friend1 = new Friend(); // instantiation of Friend class.
 		Friend friend2 = new SchoolFriend(); // instantiation of SchoolFriend class.
		Friend friend3 = new ClassFriend(); // instantiation of ClassFriend class.
		InstanceOf in = new InstanceOf(); // instantiation of InstanceOf class.
		
		in.WhatFriend(friend1); // call to the method WhatFriend in the InstanceOf. you will see the parenthesis "Just Friend!".
		in.WhatFriend(friend2); // call to the method WhatFriend in the InstanceOf. you will see the parenthesis "School Friend!".
		in.WhatFriend(friend3); // call to the method WhatFriend in the InstanceOf. you will see the parenthesis "Class Friend".
		
	}
}
