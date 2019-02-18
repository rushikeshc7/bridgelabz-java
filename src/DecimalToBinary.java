import java.util.Scanner;

import utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int n = sc.nextInt();
        u.toBinary(n);
	}

}
