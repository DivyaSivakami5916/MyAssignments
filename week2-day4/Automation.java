package week2.day4;

public class Automation extends MultipleLanguage implements Language,Testtool{
	
	public void java()
	{
		System.out.println("Java");
		
	}
	public void selenium()
	{
		System.out.println("Hello Selenium");
	}
	public void ruby()
	{
		System.out.println("Ruby");
		
	}
	public void python()
	{
		System.out.println("Python");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation at=new Automation();
		at.python();
		at.ruby();
		at.java();
		at.selenium();
		
	}

}
