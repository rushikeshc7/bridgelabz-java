package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class SquareRoot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        double n = Double.parseDouble(args[0]);
		double result = u.sqRoot(n);
		System.out.println(result);
	}

}

