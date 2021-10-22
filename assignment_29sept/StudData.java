package assignment_29sept;
/*
 * Ask end user to enter following details 

 Roll no
 Student name
 Semester1 marks
 Semester 2 marks
 Semester 3 Marks
.....

Ask for four entries.

Calculate percentage of marks and store into file student.dat

 */

public class StudData {
	
	private int sRollNo;
	private String sName;
	private int marksSem1;
	private int marksSem2;
	private int marksSem3;
	private int marksSem4;
	private double percentage;
	
	public int getsRollNo() {
		return sRollNo;
	}
	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getMarksSem1() {
		return marksSem1;
	}
	public void setMarksSem1(int marksSem1) {
		this.marksSem1 = marksSem1;
	}
	public int getMarksSem2() {
		return marksSem2;
	}
	public void setMarksSem2(int marksSem2) {
		this.marksSem2 = marksSem2;
	}
	public int getMarksSem3() {
		return marksSem3;
	}
	public void setMarksSem3(int marksSem3) {
		this.marksSem3 = marksSem3;
	}
	public int getMarksSem4() {
		return marksSem4;
	}
	public void setMarksSem4(int marksSem4) {
		this.marksSem4 = marksSem4;
	}
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double studentPercentage) {
		this.percentage = studentPercentage;
	}
	@Override
	public String toString() {
		return "StudentDetails [sRollNo=" + sRollNo + ", sName=" + sName + ", marksSem1=" + marksSem1
				+ ", marksSem2=" + marksSem2 + ", marksSem3=" + marksSem3 + ", marksSem4=" + marksSem4
				+ ", percentage=" + percentage + "]";
	}
	
	

}
