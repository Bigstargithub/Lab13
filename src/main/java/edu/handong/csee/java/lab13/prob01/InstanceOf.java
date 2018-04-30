package edu.handong.csee.java.lab13.prob01;

public class InstanceOf {

	public static void WhatFriend(Friend friend)
	{
		if(friend instanceof ClassFriend)
		{
			ClassFriend c = new ClassFriend();
			c.classfriend();
		}
		else if(friend instanceof SchoolFriend)
		{
			SchoolFriend s = new SchoolFriend();
			s.schoolfriend();
		}
		else
		{
			friend.JustFriend();
		}
	}
}
