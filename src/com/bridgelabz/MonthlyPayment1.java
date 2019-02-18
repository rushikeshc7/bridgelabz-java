package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class MonthlyPayment1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        double P = Double.parseDouble(args[0]);
        double Y = Double.parseDouble(args[1]);
        double R = Double.parseDouble(args[2]);
        double payment = u.pay(P, Y, R);
        System.out.println("Monthly Payment is:" + payment);
	}

}