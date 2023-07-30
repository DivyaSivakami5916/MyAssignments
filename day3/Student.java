package week2.day3;

//Multilevel Inheritance
public class Student extends Department				
{
	public void StudentName()
	{
		System.out.println("The name of the student is : Divya");

	}
	public void StudentDepartment()
	{
		System.out.println("The name of the student department is : CSE");

	}
	public void StudentId()
	{
		System.out.println("The ID of the student is : 2013CSE5916");

	}
	public static void main(String[] args) {
	 Student st=new Student();
	 st.CollegeName();
	 st.CollegeRank();
	 st.CollegeCode();
	 st.DepartmentName();
	 st.StudentName();
	 st.StudentDepartment();
	 st.StudentId();
	
	}


}
