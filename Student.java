package org.student;

import org.department.department;

public class Student extends department{

	public void studentName(String s1) {
	System.out.println("student name - " +s1);	
	}
	public void studentdepartment(String s2) {
		System.out.println("studentdepartment - "+s2);
	}
	public void studentid(int i) {
		System.out.println("studentid - " +i);
	}

 
	public static void main(String[] args) {
		Student s=new Student();
		s.collegecode(1234);
		s.collegename("abcd");
		s.collegerank("S");
		s.departmentname("selenium");
		s.studentName("vijayalaxmi");
		s.studentdepartment("webdriver");
		s.studentid(12);
		
	}

}
