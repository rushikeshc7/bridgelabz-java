package bridgelabzDataStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Utility u = new Utility();
        int ch;
        FileReader fr = null;
        String str = "";
        try {
        	fr = new FileReader("unOrdered.txt"); 
        	BufferedReader br= new BufferedReader(fr);
        	while((ch = br.read()) != 0)
        	{
        		System.out.println(ch);
        		str = str + ch;
        	}
        	br.close();
          fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Enter the number to check:");
        String num = u.inputString();
        u.orderedListWord(num, str);
	}

}
