package edu.handong.csee.java.lab13.prob01;

public class School {

	public static void main(String[] args)
	{
		Friend friend1 = new Friend();
		Friend friend2 = new SchoolFriend();
		Friend friend3 = new ClassFriend();
		InstanceOf in = new InstanceOf();
		
		in.WhatFriend(friend1);
		in.WhatFriend(friend2);
		in.WhatFriend(friend3);
		
	}
}
