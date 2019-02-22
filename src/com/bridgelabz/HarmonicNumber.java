package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        System.out.println("Enter the Number:");
   	    double N=u.inputDouble();
        double result = u.harmonicNumber(N);
        System.out.println(N + "th Harmonic number is " + result);
	}

}
