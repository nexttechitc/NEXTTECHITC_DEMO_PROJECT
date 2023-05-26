package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse_Hover {
	
	@Test
	public void hover() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
     WebDriver   driver = new ChromeDriver(); 
		driver.get("https://www.dell.com/en-us"); //Open URL
		driver.manage().window().maximize();
		
		Actions  ac = new Actions(driver); 
		
		ac.moveToElement(driver.findElement(By.xpath("//span[text()= 'Services']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Support Services")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
