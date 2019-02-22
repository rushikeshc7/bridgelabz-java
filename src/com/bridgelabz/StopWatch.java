package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start,end;
        Utility u=new Utility();
        System.out.println("Enter 1 to start");
        int s=u.inputInt();
        start=u.currentTime();
        
        System.out.println("Enter 2 to end");
        int e=u.inputInt();
        end=u.currentTime();
        long result=u.elapsedTime(start, end);
        System.out.println("Elapsed time in milliseconds is: " + result);
        System.out.println("Elapsed time in seconds is: " + (double) result/1000);
	}

}
