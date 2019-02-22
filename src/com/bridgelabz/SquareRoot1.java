package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class SquareRoot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        double num = Double.parseDouble(args[0]);
		double result = u.sqRoot(num);
		System.out.println("Square root of the number is:" + result);
        
	}

}

