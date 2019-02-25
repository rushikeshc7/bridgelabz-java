package bridgelabzDataStructure;

import utility.Utility;
import Method.Queue;
public class BankingCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u = new Utility();
        System.out.println("#Welcome to Bank#");
        
        //Account balance before deposit or withdrawal
        double accBalance = 15000;
        System.out.println("The account balance is: " + accBalance);
        u.bankCashCounter(accBalance);
	}


}
