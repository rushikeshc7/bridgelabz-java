package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        System.out.println("Enter number of elements in the array:");
        int n=u.inputInt();
        System.out.println("Enter array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=u.inputInt();
        }
        u.bubble(arr, n);
	}

}
