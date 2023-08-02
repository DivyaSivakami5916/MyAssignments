package week2.day4;

public class MyPhone implements Android{

		public void watchVideo() {
			System.out.println("Let's watch a video");
		}
		public void openApp()
		{
			System.out.println("Open the App");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Android a=new MyPhone();
		a.watchVideo();
		a.openApp();
	}

}
