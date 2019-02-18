package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String:");
        String str1=sc.next();
        System.out.println("Enter the second String:");
        String str2=sc.next();
        u.anagramStrings(str1,str2);
	}

}
