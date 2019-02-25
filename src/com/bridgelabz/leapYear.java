package com.bridgelabz;
import utility.Utility;
import java.util.Scanner;


public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();

		System.out.println("Enter the year");
		int y=u.inputInt();
		u.checkLeapYear(y);
	}

}
