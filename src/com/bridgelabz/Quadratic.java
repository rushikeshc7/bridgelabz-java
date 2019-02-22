package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
        System.out.println("Enter the a,b and c:");
        double a=u.inputDouble();
        double b=u.inputDouble();
        double c=u.inputDouble();
        u.quadraticEquation(a, b, c);
	}

}
