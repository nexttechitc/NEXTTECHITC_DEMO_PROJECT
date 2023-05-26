package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Appert_demo {
	
	@Test
	public void alertd() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
     WebDriver   driver = new ChromeDriver(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //Open URL
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("login1")).sendKeys("quality");
		Thread.sleep(3000);
		driver.close();
	}

}
