package bridgelabzDataStructure;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import utility.Utility;

public class UnorderedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u = new Utility();
        int ch;
        FileReader fr = null;
        String str = "";
        try {
        	fr = new FileReader("unOrdered.txt"); 
        	while((ch = fr.read()) != -1)
        	{
        		System.out.println((char)ch);
        		str = str + (char)ch;
        	}
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
