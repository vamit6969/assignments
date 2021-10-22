package assignment_28sept_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class PersistStudData {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();

		Student student1 = new Student();
		student1.setId(101);
		student1.setName("Mayank");
		int marks1[] = { 80, 78, 96, 55, 60 };
		student1.setMarks(marks1);
		studentList.add(student1);

		Student student2 = new Student();
		student2.setId(102);
		student2.setName("Vipin");
		int marks2[] = { 70, 68, 86, 75, 77 };
		student2.setMarks(marks2);
		studentList.add(student2);

		Student student3 = new Student();
		student3.setId(103);
		student3.setName("Rahul");
		int marks3[] = { 90, 78, 96, 95, 69 };
		student3.setMarks(marks3);
		studentList.add(student3);

		Student student4 = new Student();
		student4.setId(104);
		student4.setName("peetal");
		int marks4[] = { 50, 68, 56, 65, 80 };
		student4.setMarks(marks4);
		studentList.add(student4);

		try (OutputStream output = new FileOutputStream("D:\\FileIO\\Student.dat");
				ObjectOutputStream object = new ObjectOutputStream(output);) {
			object.writeObject(studentList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

