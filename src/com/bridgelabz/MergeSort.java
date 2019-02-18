package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter number of elements in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        u.sort(arr, 0,n-1);
        System.out.println("Sorted array:");
        for (int i=0; i<n; i++) 
        System.out.print(arr[i] + " "); 
	}

}
