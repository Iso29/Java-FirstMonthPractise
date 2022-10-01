package util;

import writeToFileMethods.Methods;
import java.lang.reflect.Method;

import Beans.Student;
import main.Config;

public class StudentUtil {
	public static Student studentFill() {
		int ID = InputUtil.requireNumber("enter ID of student");
		String name = MenuUtil.requireName();
		
		String surname = MenuUtil.requireSurname();
		
		int age = MenuUtil.requireAge();
		
		String classNum = MenuUtil.requireClass();
		
		Student student = new Student(ID,name,surname,age,classNum);
		return student;
	} 
	
	public static void printAllStudent () throws Exception {
		if(Config.students==null) {
			return ;
		}
		else {
			for(int i=0;i<Config.students.length;i++) {
				Student st = Config.students[i];
				System.out.println(st.getFullInfo());
			}
		}System.out.println("---------------------");
	}
	
	public static void registerStudent() throws Exception {
		int count  = InputUtil.requireNumber("How many students you want to register ?");
		Config.students = new Student[count]; 
		
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+" .Register");
	
			
			Config.students[i] = StudentUtil.studentFill();
		}
		System.out.println("registeration completed successfully");
		
		StudentUtil.printAllStudent();
		System.out.println("---------------------");
	
	}
	
	public static void findAndPrintStudent () throws Exception {
		Student[] foundStudent = findSt();
		for(int i=0;i<foundStudent.length;i++) {
			Student st = foundStudent[i];
			System.out.println(st.getFullInfo());
		}System.out.println("---------------------");
	}
	
	public static Student[] findSt() throws Exception {
		String text = InputUtil.requiretext("enter ID number , name, surname, age or class name");
		int count = 0;
		for(int i=0;i<Config.students.length;i++) {
			Student st = Config.students[i];
			if(Integer.toString(st.getID()).contains(text) || st.getStudentName().contains(text) || st.getStudentSurname().contains(text) || st.getClassNum().contains(text) || Integer.toString(st.getStudentAge()).contains(text)) {
				count ++;
			}
		}
		Student[] findoutSt =new Student[count];
		int number =0;
		for(int i=0;i<Config.students.length;i++) {
			Student st = Config.students[i];
			if(Integer.toString(st.getID()).contains(text) || st.getStudentName().contains(text) || st.getStudentSurname().contains(text) || st.getClassNum().contains(text) || Integer.toString(st.getStudentAge()).contains(text)) {
				findoutSt[number++]=st;
				
			}
		}
		return findoutSt;
	}
	
	public static void updateStudent() throws Exception {
		StudentUtil.printAllStudent();
		int i = InputUtil.requireNumber("in Which student do you want to change ? ");
		if(i<Config.students.length) {
			Student st = StudentUtil.studentFill();
			Config.students[i-1]=st;
		}
		else {
			return;
		}
	}
	public static void updateStudentV2() throws Exception {
		StudentUtil.printAllStudent();
		int i = InputUtil.requireNumber("which student do you want to update ?");
		if(InputUtil.requiretext("Do you want to update name of student,if you want to write 'yes',otherwise no ").contains("yes")) {
			Config.students[i-1].setStudentName(MenuUtil.requireName());
		}
		if(InputUtil.requiretext("Do you want to update surname of student,if you want to write 'yes' ,otherwise no").contains("yes")) {
			Config.students[i-1].setStudentSurname(MenuUtil.requireSurname());
		}
		if(InputUtil.requiretext("Do you want to update age of student,if you want to write 'yes',otherwise no ").contains("yes")) {
			Config.students[i-1].setStudentAge(MenuUtil.requireAge());
		}
		if(InputUtil.requiretext("Do you want to update class name of student,if you want to write 'yes' otherwise no ").contains("yes")) {
			Config.students[i-1].setClassNum(MenuUtil.requireClass());
		}
	}
	
	public static void updateStudentV3() throws Exception {
		StudentUtil.printAllStudent();
		int index = InputUtil.requireNumber("enter index of student Which you want to update ");
		Student selectedStudent = Config.students[index-1];
		
		String changeParameters = InputUtil.requiretext("Which sections do you want to update : name , surname, age ,class");
		
		String[] parameters = changeParameters.split(",");
		for(int i=0;i<parameters.length;i++) {
			String pr = parameters[i];
			if(pr.equalsIgnoreCase("name")) {
				selectedStudent.setStudentName(MenuUtil.requireName());
			}
			else if(pr.equalsIgnoreCase("surname")) {
				selectedStudent.setStudentSurname(MenuUtil.requireSurname());
			}
			else if(pr.equalsIgnoreCase("age")) {
				selectedStudent.setStudentAge(MenuUtil.requireAge());
			}
			else if(pr.equalsIgnoreCase("class")) {
				selectedStudent.setClassNum(MenuUtil.requireClass());
			}
		}
		System.out.println("---------------------");
		
	}
}
