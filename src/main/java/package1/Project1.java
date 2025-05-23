package package1;

import org.openqa.selenium.By;
//import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//.................................................................		
		
		//webdriver initialization
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
//..................................................................		
		
//	Autofill username & password then Auto login
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
//...................................................................		
		
// Type1 method	for title matching
		
		String ExpectedTitle = "Swag Labs";
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		
		if (Actualtitle.equals(ExpectedTitle)){
		
			System.out.println("Title Matched");
	}
		
		else {
			
			System.out.println("Title doesn't Match");
		}
//....................................................................		
		
////	Type2 method
//		
//		String expectedTitle = "Swag Labs";
//        String actualTitle = driver.getTitle();
//        //Assert.assertEquals("Page title does not match!", ExpectedTitle, ActualTitle); //for TestNG
//        //assertEquals("Page title does not match!", ExpectedTitle, ActualTitle);	       //for Junit
//		
		
//....................................................................
		
		//For link matching (Assignment)
		
//		String expectedURL = "https://www.saucedemo.com/";
//		String actualURL = driver.getCurrentUrl(); // Use getCurrentUrl() instead of getURL()
//		System.out.println(actualURL);
//
//		if (actualURL.equals(expectedURL)) {
//			
//		    System.out.println("URL Matched");
//		    
//		    
//		} else {
//			
//		    System.out.println("URL doesn't Match");
//		}
		
		
//....................................................................		
		
		//for Relative path
	//	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		
		
		
		
//....................................................................		
		//for Absolute path
	//	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
		
		
//....................................................................
		
		
		//for CSS path (tagname#id)
		
		
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
		
		
	
		
		}

	
		
	}

