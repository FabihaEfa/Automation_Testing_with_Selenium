package package2;
//import dev.failsafe.internal.util.Assert;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;


public class Project2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//.................................................................		
		
		//webdriver initialization
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
//..................................................................		
		
//	Autofill radio-button
		
		WebElement radiobutton = driver.findElement(By.id("male"));
		radiobutton.click();
		
		
//  raidobutton is selcted or not
		
		assert radiobutton.isSelected();
		
		System.out.println(radiobutton.isSelected());
		
//...................................................................		
		
// 	Autofill Checklist button 
//  for option 2 when the id is same for every options
//  Assignment
		
		WebElement option2 = driver.findElement(By.name("option2"));
		option2.click();
		
//...................................................................		
// Click checkbox with value="2"
//		for (WebElement checkbox : checkboxes) {
//		    if (checkbox.getAttribute("value").equals("2")) {
//		        checkbox.click();
//		        break;
//		    }
//		}
		
		
//...................................................................
		
//  Dropdown..... for selecting option3
		
		WebElement testDropDown  = driver.findElement(By.id("option"));
 		Select dropdown = new Select(testDropDown);
 		
 		//method1
//		dropdown.selectByIndex(1);
		
		
		// method2
		
		dropdown.selectByValue("option 3");
		
		//method3
		
//		dropdown.selectByVisibleText("option 2");
		
		
//....................................................................		
		
		
		
		
		
		
	}
}



