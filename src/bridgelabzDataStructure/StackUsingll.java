package bridgelabzDataStructure;

import Method.StackUsingLinkedList;
import utility.Utility;

public class StackUsingll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Utility u = new Utility();
       System.out.println("Enter the range of numbers:");
       int num = u.inputInt();
       StackUsingLinkedList<String> anagramPrimeNum = u.anagramPrimeUsingStack(num);
       
		int size = anagramPrimeNum.size();
		
		for(int i=1; i<=size; i++) 
		{
			System.out.println(anagramPrimeNum.pop());
		}
	}

}
