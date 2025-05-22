//	login>test.all red t shirt add to cart>your cart>checkout>fist last zip>continue button click>click finish 


package package1;


import org.openqa.selenium.By;
//import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment_project {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//.................................................................		
		
		//webdriver initialization
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
//..................................................................		
		
//	Autofill username & password then Auto login
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
//...................................................................		
	
	// add to cart using relative path  ( //*[@id="add-to-cart-test.allthethings()-t-shirt-(red)"] )
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();

		
	
//...................................................................
		
		//clicking to cart  //*[@id="shopping_cart_container"]/a
		
		
		WebElement cart = driver.findElement(By.id("shopping_cart_container"));
		cart.click();
		
		//driver.findElement(By.xpath("//button[@id='shopping_cart_container']")).click();
		
	
//..................................................................
		
		//clicking checkout
		
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
	
//..................................................................
		
		//	Autofill username & password then Auto login
		
		driver.findElement(By.id("first-name")).sendKeys("Fabiha");
		driver.findElement(By.id("last-name")).sendKeys("Rahman");
		driver.findElement(By.id("postal-code")).sendKeys("203");
		driver.findElement(By.id("continue")).click();
		
		
//...................................................................
	
	
		driver.findElement(By.id("finish")).click();
		
		
		
	
	}	
	
}
