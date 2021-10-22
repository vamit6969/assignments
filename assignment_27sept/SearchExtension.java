package assignment_27sept;
//Ask user to enter extension of file on console , Search for all files with that extension in all drives of system.

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class SearchExtension {
		 static int count=1;
	 public static void main(String args[]) throws IOException {
		 try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter extension : ");
				String ext = sc.next();
				File file = new File("D:\\");
				if (file.isDirectory()) {
					try {
						listOfFiles(file, ext);
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Not a valid Path");
				}
			}
			
			System.out.println("Total files Available with the given extension: "+(count-1));
		}
		 
	 public static void listOfFiles(File file, String find) throws IOException {
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {

				if (file2.isDirectory()) {
					if (!file2.isHidden()) {
						listOfFiles(file2, find);
					}
				} else if (file2.isFile()) 
				{
					if(file2.isHidden()) {
						continue;
					}
					if (file2.getName().endsWith(find)) {
						System.out.println(count+". "+file2.getCanonicalPath());
						count++;
					}
				}

			}

	 }
		 }
	 