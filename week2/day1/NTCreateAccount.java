package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement currency = driver.findElement(By.id("currencyUomId"));         
        	Select c=new Select(currency);
        	c.selectByValue("INR");
       		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
        	driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Localname");
        	driver.findElement(By.xpath("//input[contains(@id,'officeSiteName')]")).sendKeys("Office Sight Name");
        	driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("900000");
        	WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select idd=new Select(industry);
		idd.selectByIndex(3);
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));         
        	Select odd=new Select(owner);
        	odd.selectByVisibleText("S-Corporation");
        	WebElement source = driver.findElement(By.id("dataSourceId"));         
        	Select sdd=new Select(source);
        	sdd.selectByValue("LEAD_EMPLOYEE");
        	WebElement market = driver.findElement(By.id("marketingCampaignId"));
		Select mdd=new Select(market);
		mdd.selectByIndex(6);
		WebElement stateprovince = driver.findElement(By.id("generalStateProvinceGeoId"));         
        	Select spdd=new Select(stateprovince);
        	spdd.selectByValue("TX");
        	//driver.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();
        	driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
		driver.close();
	}

}
