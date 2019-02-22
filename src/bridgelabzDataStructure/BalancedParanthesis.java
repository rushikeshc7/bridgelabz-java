package bridgelabzDataStructure;

import java.util.Scanner;

import utility.Utility;

public class BalancedParanthesis {
    public static void main(String[] args) {
    Utility u = new Utility(); 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter expression: ");
	String exp = sc.next(); 
   
    boolean isBalanced = u.balancedParanthesis(exp);
	if(isBalanced == true)
		System.out.println("String is Balanced");
	else
        System.out.println("String is not Balanced");
    }
}
