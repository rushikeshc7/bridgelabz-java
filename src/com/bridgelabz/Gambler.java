package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Utility u=new Utility();
        System.out.println("Enter the Stake:");   //Stake
        int stake=u.inputInt();
        System.out.println("Enter the goal:");    //Goal
        int goal=u.inputInt();
        System.out.println("Enter the NoOftimes:"); //No of Trails
        int NoOfTimes=u.inputInt();
        u.GamblerState(stake, goal, NoOfTimes);   // Function call
	}

}
