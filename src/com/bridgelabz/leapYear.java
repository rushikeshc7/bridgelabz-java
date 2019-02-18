package com.bridgelabz;
import utility.Utility;
import java.util.Scanner;


public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int y=sc.nextInt();
		u.checkLeapYear(y);
	}

}
