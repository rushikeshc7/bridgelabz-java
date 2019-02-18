package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		int notes[] = {1000,500,100,50,10,5,2,1};
		System.out.println("Enter the amount:");
		int amt=sc.nextInt();
		int total=0;
		int totalNote=u.vendingMachine(notes, amt, total, 0);
		System.out.println("Total number of notes are " + totalNote);
	}

}
