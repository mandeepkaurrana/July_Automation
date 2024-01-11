package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ELLogin {
	@Test
	public void loginToEncapsulateLogics() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.encapsulatelogics.com");
		
		WebElement we=driver.findElement(By.linkText("Practice Forms"));
		we.click();
		
		WebElement usertextbox=driver.findElement(By.id("log"));
		usertextbox.sendKeys("adminmk");
		
		WebElement passwordbox=driver.findElement(By.id("pwd"));
		passwordbox.sendKeys("code");
		
		
		WebElement loginbutton=driver.findElement(By.name("submit"));
		loginbutton.click();
	
	}
	@Test
	public void testmethod() {
		System.out.println("test method");
	}
}
