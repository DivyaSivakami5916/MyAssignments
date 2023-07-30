package week2.day3;

public class Iphone extends IOS {
	public void makeCall() {
		System.out.println("Start to make the Call");
	}	
	public void sendSMS() {
		System.out.println("Start to send the SMS");
			}
	public void increaseVolume() {
		System.out.println("Iphone->Start to increase the volume");//overridden the base class
			}
	public static void main(String[] args) {
		Iphone iph=new Iphone();
		iph.shutdown();
		iph.sendSMS();
		iph.increaseVolume();
		iph.startApp();
		iph.makeCall();
		
}
}
