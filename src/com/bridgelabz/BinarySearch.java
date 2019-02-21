package com.bridgelabz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import utility.Utility;

public class BinarySearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        int ch;
    	String str = " ";
    	String strArr[];
    	FileReader fr = null;
        try {
    	   fr = new FileReader("file.txt");		
    	   while((ch = fr.read()) != -1)
           {
           	System.out.print((char)ch);
           	str += (char)ch;
            } 
    	fr.close();
    	}
        catch(FileNotFoundException e)
    	{
        	e.printStackTrace();
    	}
    
        strArr = str.split(" ");
        u.bubbleSortStr(strArr, strArr.length);
        for(int i=0;i<strArr.length;i++)
        {
        	System.out.print(strArr[i] + " ");
        }
        System.out.println("\nEnter the word you want to search:");
	        String x = sc.next();
	       
	        if(u.binarySearchWord(strArr, x) != -1)
		     	System.out.println("String found");
	        else
		     	System.out.println("String not found");
	}
}
