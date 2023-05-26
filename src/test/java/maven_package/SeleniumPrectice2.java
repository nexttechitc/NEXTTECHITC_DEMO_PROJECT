package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumPrectice2 {
	WebDriver driver;
	@Test
	public void nexttech() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(); 
		driver.get("https://demoblaze.com/"); //Open URL
		driver.manage().window().maximize();
		driver.findElement(By.id("signin2")).click(); // Click Sign-Up Link
		Thread.sleep(3000);
		driver.findElement(By.id("sign-username")).sendKeys("qualitytake");// Enter User Name
		Thread.sleep(3000);
		driver.findElement(By.id("sign-password")).sendKeys("qu12345"); // Enter Password
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();// Click Sign-up Button
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
