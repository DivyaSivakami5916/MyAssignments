package Week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAss {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
	
				
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
   
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();

		Thread.sleep(2000);

			
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	    driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	
	    
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
	    driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
	  

	    driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();	
	    Alert alert2 = driver.switchTo().alert();
	    alert2.sendKeys("Divya");
	    alert2.accept();
	  
  
	    driver.findElement(By.xpath("//span[text()='Delete']")).click();
	    driver.findElement(By.xpath("//span[text()='No']")).click();
	  
  
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt111']")).click();  
	    driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
	 
	    driver.close();
	
	}

}



