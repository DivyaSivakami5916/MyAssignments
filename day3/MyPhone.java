package week2.day3;

public class MyPhone {
	
	public void display()
	{
		System.out.println("Display My phone");
		
	}

	public static void main(String[] args) {
		Iphone iph=new Iphone();
		iph.shutdown();
		iph.sendSMS();
		iph.increaseVolume();
		iph.makeCall();
		iph.startApp();
		MyPhone mph=new MyPhone();
		mph.display();

	}

}
