package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Comhar360");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivakami");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divyasivakami@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9790359691");
		
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(source);
		dd.selectByIndex(4);

		WebElement marketcamp=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mdd=new Select(marketcamp);
		mdd.selectByVisibleText("Automobile");
		
		WebElement owner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select odd=new Select(owner);
		odd.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		driver.close();

	}

}
