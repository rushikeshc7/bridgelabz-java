package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in); 
        String[] str = {"India", "America", "China", "England", "Australia", "New Zealand"};
        u.MergeSort(str);
        for(String country: str)
        {
        	System.out.println(country);
        }
	}

}
