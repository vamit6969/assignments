package assignment_9sept;
import java.util.Scanner;

public class StudentConsoleMenu {

	public static void menuDriven()
	{
		System.out.println("Please Enter the Number option to Proceed in the Application");
		System.out.println("1----To Register new Student");
		System.out.println("2----To View Existing Student Records");
		System.out.println("3----To Update Student Record");
		System.out.println("4----To Delete Student Record");
		System.out.println("0----To Exit from the Application");
	}

	public static void main(String[] args) 
	{
		
		OperationsOnStudent S1= new OperationsOnStudent();

		int option;
		do 
		{
			Student st = new Student();
			menuDriven();
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch(option)
			{
			case 1:S1.addStudent();
			       System.out.println("Congratulations");
			       System.out.println("Your Data is Submiting");
			       System.out.println("                            ");
			       break;
			       
			       
			case 2:S1.view();
			       System.out.println(" ------------------------");
			       break;
			       
			case 3:S1.update();
			       System.out.println("Student Data is Updating ");
			       System.out.println("                              ");
			       
		       break;
			       
			case 4:S1.delete();
			       System.out.println("Deleted Successfully");
			       System.out.println("///////////////////////////////");
		           break;
			       
						       
			}
		}
		while(option !=0);
	}
}
