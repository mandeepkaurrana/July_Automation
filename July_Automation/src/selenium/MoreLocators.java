package selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

//More on Locators using Xpath

//input[@id='choice_2_7_0']//following-sibling::label
//input[@id='choice_2_7_0']//following-sibling::label[text()='Male']
//label[text()='Male']//preceding-sibling::input
//label[text()='Male']//following::input
//label[text()='Female']//preceding::label[text()='Male']
//label[text()='Female']//preceding::input[@id='choice_2_7_0']//following-sibling::label


public class MoreLocators {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.encapsulatelogics.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		
		//click practice form 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Explicit Wait
		//Wait for particular Element using WebDriverWait class
		//and use until method with ExpectedConditions
		
		driver.get("http://www.google.com");
		
		driver.close();
	}

}
