package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class couponNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        System.out.println("Enter the number of coupons:");
        int n=u.inputInt();
        u.generateCouponNumbers(n);
	}

}
