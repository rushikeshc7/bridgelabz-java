package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary:");
        String str = sc.next();  
        int result = u.swapNibbles(str);
        System.out.println("Swapped binary:" + result);
        int value = u.binaryToDec(result);
        System.out.println("The output decimal value is:" + value);
        boolean m = u.powerOf(value);
        System.out.println(m);
        }
}
