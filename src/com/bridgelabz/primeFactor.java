package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class primeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number:");
        int n=sc.nextInt();
        int q=u.primefactorization(n);
        System.out.println(q);
	}

}
