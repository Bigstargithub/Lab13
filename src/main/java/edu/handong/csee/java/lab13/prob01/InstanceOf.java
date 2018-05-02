package edu.handong.csee.java.lab13.prob01; // the package.

/**
 * This is a public method, InstanceOf.
 * 
 * @author Bigstar
 *
 */
public class InstanceOf {

	/**
	 * This is a public method and the type is static. </br>
	 * The parameter is a instanciation of Friend class.
	 * @param friend
	 */
	
	public static void WhatFriend(Friend friend)
	{
		
		if(friend instanceof ClassFriend) //if you want to call to the instance of ClassFriend class.
		{
			ClassFriend c = new ClassFriend(); // Instanciation of ClassFriend class.
			c.classfriend(); // call to classfriend method in the ClassFriend class.
		}
		
		else if(friend instanceof SchoolFriend) // if you want to call to the instance of SchoolFriend class.
		{
			SchoolFriend s = new SchoolFriend(); // Instanciation of SchoolFriend class.
			s.schoolfriend(); // call to schoolfriend method in the SchoolFriend class.
		}
	
		else
		{
			friend.JustFriend(); // call to JustFriend method in the Friend class.
		}
	}
}
