package week2.day4;

public class Samsung extends AndroidTv{

	public void Off()
	{
		System.out.println("Off the App");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung sam=new Samsung();
		sam.openapp();
		sam.watchVideo();
	}

}
