package assignment_9sept;
import java.util.Scanner;
import java.util.ArrayList;

public class OperationsOnStudent {
	
	public static ArrayList<Student> list= new ArrayList<Student>();
	int ID;
	 // Add Students
   public void addStudent() 
   {
	  
	    Student student = new Student();
	    Scanner sc = new Scanner(System.in);
	    
	          System.out.println("Enter Student ID");
	          student.setsId(sc.nextInt());
	          
	          System.out.println("Enter Student Full Name");
	          student.setsName(sc.next());
	          sc.nextLine();
	           
	          System.out.println("Enter Student Age");
	          student.setsAge(sc.nextInt());
	          sc.nextLine();
	          
	          System.out.println("Enter Student Course");
	          student.setsCourse(sc.nextLine());
	          
	   list.add(student);
	   
	
   }

 //View students
   
   public  void view() 
   {

	  for (int i = 0; i < list.size(); i++)
	  {
		Student student = list.get(i);
		   System.out.println("******************************************************************************");
		     System.out.println("Student ID: "+student.getsId());
		     System.out.println("Student Name: "+student.getsName());
		     System.out.println("Student Age: "+student.getsCourse());
		     System.out.println("Student Course:"+student.getsAge());
		   System.out.println("******************************************************************************");
	  }
	   	  
   }
   
 //Delete
   
   public void delete() 
   {
	   System.out.println("Enter Student ID");
	   Scanner sc = new Scanner(System.in);
	   int ID = sc.nextInt();
	   	   
	   for (int i = 0; i < list.size(); i++) 
	   {
		   Student student = list.get(i);
		   if(student.getsId()==ID) 
		   {
			   list.remove(student);
			   break;
		   }

	   }
   }
   
 //Udated Details
   
   public void update()
   {
	   System.out.println("Enter Student ID");
	   Scanner sc = new Scanner(System.in);
	   int ID = sc.nextInt();
	   	   
	   for (int i = 0; i < list.size(); i++) 
	   {
		   Student student = list.get(i);
		   if(student.getsId()==ID) 
		   {
			   System.out.println("Enter Student new Name");
		          student.setsName(sc.next());
		          sc.nextLine();
		           
		          System.out.println("Enter Student new Age");
		          student.setsAge(sc.nextInt());
		          sc.nextLine();
		          
		          System.out.println("Enter Student new Course");
		          student.setsCourse(sc.nextLine());
		   }
	   }
   }
   }

