package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Stake:");   //Stake
        int stake=sc.nextInt();
        System.out.println("Enter the goal:");    //Goal
        int goal=sc.nextInt();
        System.out.println("Enter the NoOftimes:"); //No of Trails
        int NoOfTimes=sc.nextInt();
        u.GamblerState(stake, goal, NoOfTimes);   // Function call
	}

}
