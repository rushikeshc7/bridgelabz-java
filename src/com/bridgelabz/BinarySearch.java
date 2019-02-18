package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

import utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of words you want to search:");
        int n = sc.nextInt();
        String[] words=new String[n];
        System.out.println("Enter the words");
        for(int i=0;i<n;i++)
        {
        	words[i]=sc.next();
        }
        Arrays.sort(words);
        System.out.println("Enter the word you want to search:");
    	String x = sc.next();
        int z=u.binarySearchWord(words, x);
        if(z!=-1)
        {
        	System.out.println("Word found");
        }
        else
        {
        	System.out.println("Word not found");
        }
	}

}
