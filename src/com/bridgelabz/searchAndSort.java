package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class searchAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
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
         choice = sc.nextInt();
         switch(choice)
         {
         case 1:
        	System.out.println("Enter no of elements of array:");
            int n = sc.nextInt();
            System.out.println("Enter elements in int array:");
            int arr[] = new int[n];
            for(int i=0;i<arr.length;i++)
            {
            	arr[i]=sc.nextInt();
            }
            System.out.println("Enter element you want to search:");
            int key = sc.nextInt();
            long time1 = System.currentTimeMillis();
//            long start=u.currentTime();
    		if(u.binSearchInt(arr , key) > -1) {
    			System.out.println("Number found");
    		}
    		else
    			System.out.println("Not found");
    		long time2 = System.currentTimeMillis();
    		long result = time2-time1;
    		System.out.println("Time taken for binary search: " +  ((double)result / 1000) + " second.");
            break;
            
         case 2:
        	System.out.println("Enter no of elements of array:");
            n = sc.nextInt();
            System.out.println("Enter elements in string array");
            String array[] = new String[n];
            for(int j=0;j<array.length;j++)
            {
            	array[j]=sc.next();
            }
            System.out.println("Enter String you want to search:");
            String keyStr = sc.next();
            time1 = System.currentTimeMillis();
    		if(u.binSearchStr(array , keyStr) > -1) {
    			System.out.println("String found");
    		}
    		else
    			System.out.println("Not found");
    		time2 = System.currentTimeMillis();
    		result = time2-time1;
    		System.out.println("Time taken for binary search: " +  ((double)result / 1000) + " second.");

            break; 
            
         case 3:
        	System.out.println("Enter no of elements of array:");
            int nI = sc.nextInt();
            System.out.println("Enter elements in int array:");
            int arrInt[] = new int[nI];
            for(int k=0;k<arrInt.length;k++)
            {
            	arrInt[k]=sc.nextInt();
            }  
            int[] copyArrInt = arrInt;
    	    time1 = System.currentTimeMillis();		
    	    copyArrInt = u.insertionSortInt(arrInt, nI);		
    		time2 = System.currentTimeMillis();
    		result = time2-time1;
    		System.out.println("Time taken for insertion sort: " +  ((double)result/ 1000) + " second.");		
    		for(int i : arrInt) {
    			System.out.print(i + " ");
    		}
            break;
            
         case 4:
        	System.out.println("Enter no of elements of array:");
            int nS = sc.nextInt();
            System.out.println("Enter elements in string array:");
            String arrStr[] = new String[nS];
            for(int p=0;p<arrStr.length;p++)
            {
            	arrStr[p]=sc.next();
            } 
            String[] copyArrStr = arrStr;
    		time1 = System.currentTimeMillis();		
    		copyArrStr = u.insertionSortStr(arrStr, nS);		
    		time2 = System.currentTimeMillis();
    		result = time2-time1;
    		System.out.println("Time taken for insertion sort: " +  ((double)result / 1000) + " second.");		
    		for(String string : copyArrStr) {
    			System.out.print(string + " ");
    		}
            break;
         
         case 5:
        	System.out.println("Enter no of elements of array:");
            int nI1 = sc.nextInt();
            System.out.println("Enter elements in int array:");
            int arrInt1[] = new int[nI1];
            for(int q=0;q<arrInt1.length;q++)
            {
            	arrInt1[q]=sc.nextInt();
            }
            int[] copyArrInt1 = arrInt1;
            time1 = System.currentTimeMillis();
//          start=u.currentTime();
            copyArrInt1 = u.bubbleSortInt(arrInt1, nI1);		
    		time2 = System.currentTimeMillis();
    		result = time2-time1;
    		System.out.println("Time taken for bubble sort: " +  ((double)result / 1000) + " second.");		
    		for(int i : copyArrInt1) {
    			System.out.print(i + " ");
    		}
            break;
          
         case 6:
        	System.out.println("Enter no of elements of array:");
            int nS1 = sc.nextInt();
            System.out.println("Enter elements in string array:");
            String arrStr1[] = new String[nS1];
            for(int r=0;r<arrStr1.length;r++)
            {
            	arrStr1[r]=sc.next();
            }   
            String[] copyArrStr1 = arrStr1;
            time1 = System.currentTimeMillis();
            copyArrStr1 =  u.bubbleSortStr(arrStr1, nS1);		
    		time2 = System.currentTimeMillis();
    		result = time2-time1;
    		System.out.println("Time taken for bubble sort: " +  ((double)result/ 1000) + " second.");		
    		for(String string : copyArrStr1) {
    			System.out.print(string + " ");
    		}
            break;
            
         default:
        	 System.out.println("Wrong choice. Please select between 1 to 6");
        	 choice = sc.nextInt();
         }
       }while(choice!=0);       
    }
}
