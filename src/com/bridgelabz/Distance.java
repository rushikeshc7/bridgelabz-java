package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        try
        {
        double x=Double.parseDouble(args[0]);
        double y=Double.parseDouble(args[1]);
        double result = u.distanceMeasurement(x,y);
        System.out.format("The distance of (%.2f , %.2f) from origin is %.2f" ,
				x, y, result);
        }
        catch(ArrayIndexOutOfBoundsException ae){
        	ae.printStackTrace();
        }
	}

}
