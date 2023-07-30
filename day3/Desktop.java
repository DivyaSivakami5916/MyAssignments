package week2.day3;

//Single Inheritance
public class Desktop extends Computer {

	public void DesktopSize()
	{
		System.out.println("The Desktop Size is 28.5 (W) x 34.3 (D) x 10.1 (H) cm");
	}
	public static void main(String[] args) {
		Desktop ds=new Desktop();
		ds.ComputerModels();
		ds.DesktopSize();
	}

}
