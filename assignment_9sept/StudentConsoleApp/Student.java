/*
 Create an menu drive console-based application to register,view,update and delete student details.
*/

package assignment_9sept;

public class Student {
	
	private int sId;
	private String sName;
	private int sAge;
	private String sCourse;
	
	public Student()
	{
		super();
	}

	public Student(int sId, String sName, int sAge, String sCourse) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sCourse = sCourse;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	
	
}