package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MyFirstAotomationScripts {
	
	@Test
	public void myfirsttest() throws Exception {
		//System.setProperty( "webdriver.chrome.driver","C:\\Users\\nextt\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe" );
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(co); 
		//driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://nexttechitc.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Courses")).click();
		Thread.sleep(5000);
		driver.close();
		
		// Java is fing us one of the method calld Thread
	}

}
