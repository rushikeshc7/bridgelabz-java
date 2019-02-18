package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start,end;
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to start");
        int s=sc.nextInt();
        start=u.currentTime();
        
        System.out.println("Enter 2 to end");
        int e=sc.nextInt();
        end=u.currentTime();
        long result=u.elapsedTime(start, end);
        System.out.println("Elapsed time in milliseconds is: " + result);
        System.out.println("Elapsed time in seconds is: " + (double) result/1000);
        sc.close();
	}

}
