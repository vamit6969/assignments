package assignment_29sept;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatePercentofStudMarks {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		StudData s =new StudData();
		
		double studentPercentage;
		int sum=0;
				
		System.out.print("Enter student rollNo:");
		int rollno = input.nextInt();
		s.setsRollNo(rollno);
		
		System.out.print("Enter student Name:");
		String Name = input.next();
		s.setsName(Name);
		
		System.out.println("Enter student marks for sem 1");
		int marksSem1 = input.nextInt();
		s.setMarksSem1(marksSem1);
		sum=sum+marksSem1;
		
		System.out.println("Enter student marks for sem 2");
		int marksSem2 = input.nextInt();
		s.setMarksSem2(marksSem2);
		sum=sum+marksSem2;
		
		System.out.println("Enter student marks for sem 3");
		int marksSem3 = input.nextInt();
		s.setMarksSem3(marksSem3);
		sum=sum+marksSem3;
		
		System.out.println("Enter student marks for sem 4");
		int marksSem4 = input.nextInt();
		s.setMarksSem4(marksSem4);
		sum=sum+marksSem4;
		
		studentPercentage = (sum/(4*100))*100;
		s.setPercentage(studentPercentage);
		List<StudData> student = new ArrayList<>();
		student.add(s);
		
		ObjectMapper mapper=new ObjectMapper();
		OutputStream os=new FileOutputStream("D:\\FileIO\\student.dat");
		mapper.writeValue(os, student);

	}

}