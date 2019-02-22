package com.bridgelabz;

import utility.Utility;

public class AngramAndPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
        String[] primeNumbers = u.prime(1000);
		
		System.out.println("Anagram and prime numbers are:");
		//	prints prime numbers that are anagrams
		for(int i = 0; i < primeNumbers.length; i++) {
			for(int j = i + 1; j < primeNumbers.length; j++) {
				if(u.anagramStrings(primeNumbers[i], primeNumbers[j])) {
					System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
				}
			}
		}

		System.out.println("\nPalindrome and prime numbers are:");
		//	prints prime numbers that are palindrome
		for(int i = 0; i < primeNumbers.length; i++) {
			if(u.checkPalindrome(primeNumbers[i])) {
				System.out.println(primeNumbers[i]);
			}
		}
	}

}
