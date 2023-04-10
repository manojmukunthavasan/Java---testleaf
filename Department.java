package org.department;

import org.college.College;

public class Department extends College{
   
	public void deptName() {
		System.out.println("Mechanical");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Department dep = new Department();
    	 dep.collegeName();
         dep.collegeCode();
         dep.collegeRank();
         dep.deptName();
		
		
		
	}

}
