package Beans;

import java.io.Serializable;

public class Student implements Serializable{
	private int ID;
	private String studentName;
	private String studentSurname;
	private int studentAge;
	private String classNum;
	
	public Student () {
		
	}

	public Student(int ID,String studentName, String studentSurname, int studentAge, String classNum) {
		this.ID=ID;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentAge = studentAge;
		this.classNum = classNum;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	public String getFullInfo() {
		return "ID number : "+this.ID+"\n Name : "+this.getStudentName()+" \n Surname : "+this.getStudentSurname()+" \n Age : "+this.getStudentAge()+" \n Class : "+this.getClassNum();
	}
}
