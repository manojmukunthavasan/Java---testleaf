package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Manoj");
	}
	public void studentDept() {
		System.out.println("Mechanical Engineering Sction 'A' ");
	}
	public void studentId() {
		System.out.println("180021601036");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student st= new Student();
       st.collegeName();
       st.collegeCode();
       st.collegeRank();
       st.deptName();
       st.studentName();
       st.studentDept();
       st.studentId();
    	   
	}

}
