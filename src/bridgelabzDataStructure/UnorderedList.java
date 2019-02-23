package bridgelabzDataStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import utility.Utility;

public class UnorderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Utility u = new Utility();
        String ch;
        FileReader fr = null;
        String str = "";
        try {
        	fr = new FileReader("unOrdered.txt"); 
        	BufferedReader br= new BufferedReader(fr);
        	while((ch = br.readLine()) != null)
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
        System.out.println("Enter the word to check:");
        String word = u.inputString();
        u.unorderedListWord(word, str);
	}

}
