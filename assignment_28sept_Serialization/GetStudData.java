package assignment_28sept_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class GetStudData {

	public static void main(String[] args) {
		try(InputStream input = new FileInputStream("D:\\FileIO\\Student.dat");
			ObjectInputStream object = new ObjectInputStream(input);
			){
				Student student = (Student) object.readObject();
				System.out.println(student);		
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}