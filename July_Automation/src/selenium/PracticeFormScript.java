package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFormScript {

	public static void main(String[] args) {

		// 1st launch the browser(as per requirement) using Selenium's inbuilt browser
		// class
		ChromeDriver driver = new ChromeDriver();
		// launch in maximized window
		driver.manage().window().maximize();

		// launch URL in browser window
		driver.get("http://www.encapsulatelogics.com");

		// Locate the web element for "Practice Forms" button using locators using the
		// object of browser.
		WebElement pracForm = driver.findElement(By.linkText("Practice Forms"));

		// Now, click on the button using the reference variable of the Web element
		pracForm.click();

		// Locate and click on "Register now"
		WebElement register = driver.findElement(By.linkText("Not a member yet? Register now."));
		register.click();

		// Now, fill the registration form by locating all the input fields and provide
		// Provide user inputs data to the input text fields using sendkeys method
		WebElement userName = driver.findElement(By.id("user_login"));
		userName.sendKeys("Dev Rana");

		WebElement userEmail = driver.findElement(By.id("user_email"));
		userEmail.sendKeys("dev@yopmail.com");

		WebElement userPwd = driver.findElement(By.id("user_pass"));
		userPwd.sendKeys("dev@123");

		WebElement confPwd = driver.findElement(By.id("user_confirm_password"));
		confPwd.sendKeys("dev@123");

		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();

		// Locate and Click on "My Account" web element
		// WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		// WebElement myAccount = driver.findElement(By.linkText("My Account"));
		// WebElement myAccount = driver.findElement(By.xpath("//a/span[text()='My Account']"));
		WebElement myAccount = driver.findElement(By.xpath("//button[@type='submit']")); // Syntax: //(By.xpath(tagName[@attributeName='value']));
		myAccount.click();

		String message = myAccount.getText();
		System.out.println(message);

	}

}
