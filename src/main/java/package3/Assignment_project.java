//try testing->firstname->lastname->gender->male or female->
//option3->checklist:option3-->submit click


package package3;

//import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_project {
	

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	//.................................................................		
			
			//webdriver initialization
			
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://trytestingthis.netlify.app/");
			driver.manage().window().maximize();
	//..................................................................		
			
//		Autofill name-textbox
			
			WebElement Textbox1 = driver.findElement(By.id("fname"));
			Textbox1.sendKeys("Fabiha Rahman");
			
			WebElement Textbox2 = driver.findElement(By.id("lname"));
			Textbox2.sendKeys("Efa");
			
			
//.....................................................................
	
//	   Autofill radio-button
			
			WebElement radiobutton = driver.findElement(By.id("female"));
			radiobutton.click();
	
	
//....................................................................	
	
//	  Autofill dropdown option 3
			
			WebElement testDropDown  = driver.findElement(By.id("option"));
	 		Select dropdown = new Select(testDropDown);
	 		dropdown.selectByIndex(3);
	
//...................................................................	
	
	
//   Autofill Checkbox option 3 & 1
	 		
	 		WebElement checkbox1  = driver.findElement(By.name("option3"));
	 		checkbox1.click();
	 		
	 		
	 		WebElement checkbox2  = driver.findElement(By.name("option1"));
	 		checkbox2.click();
//....................................................................
	 		
	 		
//   Autofill guessed text
	 		
	 		
	 		WebElement datalist  = driver.findElement(By.id("datalists"));
	 		Select gussedText = new Select(datalist);
	 		
	 		gussedText.selectByValue("Mint");
	 		
	 		
//....................................................................
	 		
//   Autofill color 
	 		
	 		WebElement colorcode  = driver.findElement(By.id("favcolor"));
	 		Select color = new Select(colorcode);
	 		color.selectByValue("#ff0000");
	
	
	
	
	
	
	
	
	
		}	
	

}
