/* Create a class Person and implement Serializable ,

personId
personName
personAge
personLocation
....
get()... set()

 Using Reflection API

   1.List all the constructors in Person class.
   2.Write a code to dynamically create an object of Person class using class data.
   3. Identify if Person class is implementing Serializable interface
   4. Identify if Person class has getter() and setter() methods.
  
*/

package assignment_9sept;
import java.io.Serializable;
public class Person implements Serializable{
	
	private int personId;
	private String personName;
	private int personAge;
	private String personLocation;
	
	public Person() {
		
	}
	
	

	public Person(int personId, String personName, int personAge, String personLocation) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.personLocation = personLocation;
	}



	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonLocation() {
		return personLocation;
	}

	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}
	
}
