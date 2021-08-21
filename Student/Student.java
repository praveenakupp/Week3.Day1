package Org.Student;

import Org.Department.Department;

public class Student extends Department
{
	
	public void studentName()
	{
		System.out.println("Student Name is Akshara");
	}
	public void studentDept()
	{
		System.out.println("Student Department is Computer Science");
		
	}
	public void studentId()
	{
		System.out.println("400");
	}
	public static void main(String args[])
	{
		Student st=new Student();
		st.studentName();
		st.studentDept();
		st.studentId();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
	}

}
