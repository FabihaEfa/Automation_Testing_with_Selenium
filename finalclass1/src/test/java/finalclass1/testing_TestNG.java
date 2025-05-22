package finalclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing_TestNG {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void init () {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test (priority=2)
	
	public void TestTitle() {
		
		String ExpectedTitle = "Swag Labs";
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		Assert.assertEquals(ExpectedTitle, Actualtitle);
		
		
	}
	
	
	@Test (priority=1)
	
	public void TestURL() {
		
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl(); // Use getCurrentUrl() instead of getURL()
		System.out.println(actualURL);

		if (actualURL.equals(expectedURL)) {
			
		    System.out.println("URL Matched");
		    
		    
		} else {
			
		    System.out.println("URL doesn't Match");
		}
		
		
		
		
		
		
	}
	
	
	
	@AfterTest
	
	public void end() {
		
		driver.quit();
		
		
	}
		
		
		
		
	
	
}
