package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class QuetionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        System.out.println("Enter a no:");
        int n=u.inputInt();
        int upper=(int)Math.pow(2,n-1);
        System.out.println("Take number between '0' to "+upper);
        int count=0;
        int first=0;
        int last=upper;
        int mid=(first+last)/2;
        String x=null;
        u.question(count, first, last, mid, x, n);
	}

}
