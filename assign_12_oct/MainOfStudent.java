package assign_12_oct;

public class MainOfStudent
{
	public static void main(String[] args) 
	{
		StudentFactory factory = Student::new;
		Student student = factory.getInstance();
		student.setFirstName("Amit");
		student.setLastName("Verma");
		student.setSem1Marks(95);
		student.setSem2Marks(96);
		student.setSem3Marks(97);
		student.setSem4Marks(92);
		student.setSem5Marks(98);
		student.setSem6Marks(91);
		
		ComputeAverage avg = student::getAverageMarks;
		double averageScore = avg.compute();
		System.out.println("**** Student Data ****\n\n"+student);
		System.out.println("\nAverage Score : "+averageScore);
	}
}