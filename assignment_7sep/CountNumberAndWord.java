package assignment_7sept;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class CountNumberAndWord {
	
	 public static void main(String[] args) throws Exception {
		    int wordC = 0, numberC = 0;

		    StreamTokenizer sTokenizer = new StreamTokenizer(new FileReader("D:\\Demo.txt"));

		    while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
		      if (sTokenizer.ttype == StreamTokenizer.TT_WORD)
		        wordC++;
		      else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER)
		        numberC++;
		    }

		    System.out.println("Number of words in file: " + wordC);
		    System.out.println("Number of numbers in file: " + numberC);

		  
}

}
