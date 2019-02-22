package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		String[] intArr = u.prime(1000);
		System.out.println("Prime numbers in 0 to 1000 are:");
		for(String string : intArr) 
		{	
			System.out.print(string + " ");
		}
    }
}
