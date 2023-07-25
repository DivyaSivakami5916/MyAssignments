package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Local Name");
		driver.findElement(By.xpath("//input[contains(@id,'SiteName')]")).sendKeys("Site Name");
		driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[5]")).sendKeys("2000000");
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select idd=new Select(industry);
		idd.selectByIndex(3);
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select odd=new Select(ownership);
		odd.selectByVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select sdd=new Select(source);
		sdd.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
		Select mdd=new Select(marketing);
		mdd.selectByIndex(6);
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stdd=new Select(state);
		stdd.selectByValue("TX");
		driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
		driver.close();
		
		
		
		
	}

}
