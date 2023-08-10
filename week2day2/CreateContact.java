package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Divya");
		driver.findElement(By.id("lastNameField")).sendKeys("R");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Divya");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Rajedran");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("ContactCreated");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("divya@gmail.com");
		WebElement tex=driver.findElement(By.name("generalStateProvinceGeoId"));
        Select city =new Select(tex);
        city.selectByVisibleText("Texas");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateContactForm_description")).clear();
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        driver.getTitle();

	
	}

	}


