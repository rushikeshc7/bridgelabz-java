package com.bridgelabz;

import utility.Utility;

public class DayOfWeek{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Utility u=new Utility();
	    int mnth  = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		int days = u.calender(mnth, day, year);
		System.out.println((int)days);
	}

}
