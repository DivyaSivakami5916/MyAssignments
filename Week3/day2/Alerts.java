package Week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//promptAlert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("This is a Prompt Alert");
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		//Sweet Alert -Confirmation
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[contains(@name,'j_idt109')]")).click();
		
	}

}
