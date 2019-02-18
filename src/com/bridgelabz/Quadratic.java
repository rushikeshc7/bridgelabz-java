package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a,b and c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        u.quadraticEquation(a, b, c);
	}

}
