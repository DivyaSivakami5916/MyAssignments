package week1.day4;


import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	
		public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login");
			driver.manage().window().maximize();
			
		}

	}
