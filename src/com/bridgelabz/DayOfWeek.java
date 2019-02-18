package com.bridgelabz;

import utility.Utility;

public class DayOfWeek{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Utility u=new Utility();
	    double mnth  = Double.parseDouble(args[0]);
		double day = Double.parseDouble(args[1]);
		double year = Double.parseDouble(args[2]);
		double days = u.calender(mnth, day, year);
		System.out.println((int)days);
	}

}
