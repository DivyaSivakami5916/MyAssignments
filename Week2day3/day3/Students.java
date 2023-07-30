package week2.day3;
//method overloading
public class Students {
	public int GetStudentInfo(int id)
	{
		System.out.println("The student Id is " + id);
		return id;
	}
	public void GetStudentInfo(int stid, String name)
	{
		
		System.out.println("The student name is " + name + " "+ "and the Id is " + stid);
		
		
	}
	public void GetStudentInfo(String email,float phno)
	{
		System.out.println("The student email is " + email +" "+ "and the phone number is " +phno);
		
		
	}
	public static void main(String[] args) {
		Students sts=new Students();
		sts.GetStudentInfo(25);
		sts.GetStudentInfo(25, "Divya");
		sts.GetStudentInfo("divya@gmail.com", 9962004575f);

	}

}
