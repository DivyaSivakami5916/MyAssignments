package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@class='x-form-text x-form-field']")).sendKeys("Divya");
		driver.findElement(By.xpath("//button[@id='ext-gen341']")).click();
		driver.findElement(By.xpath("(//a[@class='linktext']/parent::div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement compname=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		compname.sendKeys("TestLeaf");
		String typedtext=compname.getAttribute("value");
		driver.findElement(By.xpath("//input[@id='ext-gen630']")).click();
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		if(text.contains(typedtext))
		{
			System.out.println("Text are matching");
		}
		else {
			System.out.println("Text are not matching");
		}
		driver.close();
	}

}
