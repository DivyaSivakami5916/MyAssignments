package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeDropDown {

	public static void main(String[] args) {
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
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sdd=new Select(source);
		sdd.selectByVisibleText("Employee");
		WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mdd=new Select(marketing);
		mdd.selectByValue("9001");
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select idd=new Select(industry);
		idd.selectByIndex(15);
		WebElement owner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select odd=new Select(owner);
		odd.selectByIndex(5);
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cdd=new Select(country);
		cdd.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
