package maven_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyFirstAotomationScripts2 {
	WebDriver driver;
	@Test
	public void tom() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(); 
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	}
	

}
