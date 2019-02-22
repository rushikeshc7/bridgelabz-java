package bridgelabzDataStructure;

import java.util.Scanner;

import Method.Dequeue;
import utility.Utility;

public class palindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u = new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word for palindrome:");
        String word = sc.next();
        boolean isPalindrome = u.checkPalindromeWord(word);
		if(isPalindrome)
			System.out.println(word+" is Palindrome");
		else
			System.out.println(word+" is not Palindrome");

	} 
}
