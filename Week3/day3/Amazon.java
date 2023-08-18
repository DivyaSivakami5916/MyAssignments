package Week3.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//span[@class='a-price-symbol']/following-sibling::span")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[text()='3.9'])[1]")).getText());
		driver.findElement(By.xpath("(//div[contains(@class,'a-section aok-relative')]//img)[1]")).click();
		Set<String> str=driver.getWindowHandles();
		for(String st:str)
		{
			driver.switchTo().window(st);
		}
		
		File ScreenshotAs=driver.getScreenshotAs(OutputType.FILE);
		File desti=new File("./sanp/shot.png");
		FileUtils.copyFile(ScreenshotAs, desti);
		driver.findElement(By.id("add-to-cart-button")).click();
		String price=(driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText());
		System.out.println(price);
		driver.close();
				
}

}