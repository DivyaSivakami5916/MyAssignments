package Week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='FLIGHT']")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		List<String> winhandle=new ArrayList<String>(windowhandles);
		driver.switchTo().window(winhandle.get(1));
		String page=driver.getTitle();
		System.out.println(page);
		driver.switchTo().window(winhandle.get(0));
		driver.close();
		
		
	}

}
