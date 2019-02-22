package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        System.out.println("Enter the first String:");
        String str1=u.inputString();
        System.out.println("Enter the second String:");
        String str2=u.inputString();
        boolean result = u.anagramStrings(str1,str2);
        if(result)
        {
        	System.out.println("The strings are anagram.");
        }
        else
        {
        	System.out.println("The strings are not anagram.");
        }
	}

}
