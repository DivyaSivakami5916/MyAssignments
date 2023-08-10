package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sam@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String str2=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']")).getText();
		System.out.println(str2);
		driver.findElement(By.xpath("(//a[@class='linktext']/parent::div)[4]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String str3=driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		System.out.println(str3);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		if(str2.equals(driver.findElement(By.id("viewLead_firstName_sp")).getText()));
		{
			System.out.println("The value is same");
	
		}
		driver.close();
		
	}

}
