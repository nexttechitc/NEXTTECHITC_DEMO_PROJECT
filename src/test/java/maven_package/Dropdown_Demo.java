package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_Demo {
	
	
	@Test
	public void drop() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
     WebDriver   driver = new ChromeDriver(); 
		driver.get("https://www.ebay.com/"); //Open URL
		driver.manage().window().maximize();
		WebElement tom =  driver.findElement(By.id("gh-cat"));
		Select sl = new Select(tom);
		
		//sl.selectByVisibleText("Coins & Paper Money");
		//sl.selectByValue("172008");
		//sl.selectByIndex(1);
		
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
	

}
