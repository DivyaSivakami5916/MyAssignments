package week1.day2;

public class Mobile {

	public void sendSms()
	{
		System.out.println("From Oppo");
			
	}
	public long makeCall(long phno)
	{
		
		System.out.println(phno);
		return phno;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		m.sendSms();
		m.makeCall(9790359691l);
	
		
	}

}
