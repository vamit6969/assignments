package assignment_27sept;
//Ask user to enter file path. Count number of words in that file, count number of numbers in that file.

import java.io.FileReader;
import java.io.StreamTokenizer;

public class CountNumAndWord{

	
		 public static void main(String[] args) throws Exception {
			    int wordCount = 0, numberCount = 0;

			    StreamTokenizer sTokenizer = new StreamTokenizer(new FileReader("D:\\count.txt"));

			    while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
			      if (sTokenizer.ttype == StreamTokenizer.TT_WORD)
			        wordCount++;
			      else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER)
			        numberCount++;
			    }

			    System.out.println("Number of words in file: " + wordCount);
			    System.out.println("Number of numbers in file: " + numberCount);

			  
	}

}
