package bridgelabzDataStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Utility u = new Utility();
        String s;
        FileReader fr = null;
        String str = "";
        try {
        	fr = new FileReader("Ordered.txt"); 
        	BufferedReader br= new BufferedReader(fr);
        	while((s = br.readLine()) != null)
        	{
        		System.out.println(s);
        		str = str + s;
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
