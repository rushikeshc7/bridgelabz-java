package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        System.out.println("Enter the String:");
        String str=u.inputString();
        u.allPermutation("", str);
	}

}
