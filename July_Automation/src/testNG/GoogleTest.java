package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//TestNg is a Java library to manage test Suite, test Classes and test methods

//Your individual Automation Script - Test Method
//Your Class will be known as Test Class
//a group of Test Classes will be know as Test Suite

//Classes in Testng.xml execute top to down
//test methods in Test Class execute alphabetically
public class GoogleTest {

	//Non test Method
	public int f1(int p) {
		return p*p;
	}
	//test Method
	@Test
	public void testGoogleSearchBar() 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement we=driver.findElement(By.id("APjFqb"));
		we.sendKeys("best java institute in Brampton");
		we.sendKeys(Keys.ENTER);
		
		//int h=f1(2);

	}

}
