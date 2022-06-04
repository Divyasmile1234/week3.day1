package org.student;

import week3.day1.classroom.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Divya");
		}
	public void studentDept() {
		System.out.println("FM");
	}
      public void studentID() {
    	  System.out.println("ID008");
      }
	public static void main(String[] args) {
		Student ram=new Student();
		ram.collegeCode();
		ram.collegeName();
		ram.deptName();
		ram.studentDept();
		ram.studentID();
		ram.studentName();

	}

}
