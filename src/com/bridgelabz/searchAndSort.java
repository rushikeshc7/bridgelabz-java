package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class searchAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        int choice=0;
        System.out.println("1. binarySearch method for integer");
        System.out.println("2. binarySearch method for String");
        System.out.println("3. insertionSort method for integer");
        System.out.println("4. insertionSort method for String");
        System.out.println("5. bubbleSort method for integer");
        System.out.println("6. bubbleSort method for String");
        
        do
        {
        	System.out.println(); 	
         System.out.println("Enter your choice:");
         choice = u.inputInt();
         switch(choice)
         {
         case 1:
        	System.out.println("Enter no of elements of array:");
            int n = u.inputInt();
            System.out.println("Enter elements in int array:");
            int arr[] = new int[n];
            for(int i=0;i<arr.length;i++)
            {
            	arr[i]=u.inputInt();
            }
            System.out.println("Enter element you want to search:");
            int key = u.inputInt();
            long start=System.currentTimeMillis();
    		if(u.binSearchInt(arr , key) > -1) {
    			System.out.println("Number found");
    		}
    		else
    			System.out.println("Not found");
    		long end = System.currentTimeMillis();
    		long result = u.elapsedTime(start, end);
    		System.out.println("\nTime taken for binary search: " +  ((double)result / 1000) + " second.");
            break;
            
         case 2:
        	System.out.println("Enter no of elements of array:");
            n = u.inputInt();
            System.out.println("Enter elements in string array");
            String array[] = new String[n];
            for(int j=0;j<array.length;j++)
            {
            	array[j]=u.inputString();
            }
            System.out.println("Enter String you want to search:");
            String keyStr = u.inputString();
            start = System.currentTimeMillis();
    		if(u.binSearchStr(array , keyStr) > -1) {
    			System.out.println("String found");
    		}
    		else
    			System.out.println("Not found");
    		end = System.currentTimeMillis();
    		result = u.elapsedTime(start, end);
    		System.out.println("\nTime taken for binary search: " +  ((double)result / 1000) + " second.");

            break; 
            
         case 3:
        	System.out.println("Enter no of elements of array:");
            int nI = u.inputInt();
            start = System.currentTimeMillis();
            System.out.println("Enter elements in int array:");
            int arrInt[] = new int[nI];
            for(int k=0;k<arrInt.length;k++)
            {
            	arrInt[k]=u.inputInt();
            }  
            u.insertionSortInt(arrInt, nI);		
    		end = System.currentTimeMillis();
    		result = u.elapsedTime(start, end);
    		System.out.println("\nTime taken for insertion sort: " +  ((double)result/ 1000) + " second.");		
            break;
            
         case 4:
        	System.out.println("Enter no of elements of array:");
        	start = System.currentTimeMillis();
        	int nS = u.inputInt();
            System.out.println("Enter elements in string array:");
            String arrStr[] = new String[nS];
            for(int p=0;p<arrStr.length;p++)
            {
            	arrStr[p]=u.inputString();
            } 
    		u.insertion(arrStr, nS);		
    		end = System.currentTimeMillis();
    		result = u.elapsedTime(start, end);
    		System.out.println("\nTime taken for insertion sort: " +  ((double)result / 1000) + " second.");		
    		
            break;
         
         case 5:
        	System.out.println("Enter no of elements of array:");
            int nI1 = u.inputInt();
            System.out.println("Enter elements in int array:");
            int arrInt1[] = new int[nI1];
            for(int q=0;q<arrInt1.length;q++)
            {
            	arrInt1[q]=u.inputInt();
            }
            int[] copyArrInt1 = arrInt1;
            start = System.currentTimeMillis();
            copyArrInt1 = u.bubbleSortInt(arrInt1, nI1);		
    		end = System.currentTimeMillis();
    		result = u.elapsedTime(start, end);
    		System.out.println("\nTime taken for bubble sort: " +  ((double)result / 1000) + " second.");		
    		for(int i : copyArrInt1) {
    			System.out.print(i + " ");
    		}
            break;
          
         case 6:
        	System.out.println("Enter no of elements of array:");
            int nS1 = u.inputInt();
            System.out.println("Enter elements in string array:");
            String arrStr1[] = new String[nS1];
            for(int r=0;r<arrStr1.length;r++)
            {
            	arrStr1[r]=u.inputString();
            }   
            String[] copyArrStr1 = arrStr1;
            start = System.currentTimeMillis();
            copyArrStr1 =  u.bubbleSortStr(arrStr1, nS1);		
    		end = System.currentTimeMillis();
    		result = u.elapsedTime(start, end);
    		System.out.println("\nTime taken for bubble sort: " +  ((double)result/ 1000) + " second.");		
    		for(String string : copyArrStr1) {
    			System.out.print(string + " ");
    		}
            break;
            
         default:
        	 System.out.println("Wrong choice. Please select between 1 to 6");
        	 choice = u.inputInt();
         }
       }while(choice!=0);       
    }
}
