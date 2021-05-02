package org.student;

import org.department.Department;

public class Student extends Department {

	 // TODO Auto-generated method stub

		public void studentName() {
			System.out.println("Mythili");
		}
		public void studentDept() {
			System.out.println("ECE");
		}
		
		public void studentId() {
			System.out.println("123456 ");
		}
		public static void main (String[] args)
		{
			Student info =new Student();
			
			info.deptName();
			info.studentDept();
			info.studentId();
			info.studentName();
	
}

	}

