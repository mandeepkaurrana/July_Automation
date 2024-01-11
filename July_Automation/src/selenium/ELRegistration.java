package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ELRegistration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.encapsulatelogics.com");
		
		driver.manage().window().maximize();
		
		WebElement practiceFormLink=driver.findElement(By.linkText("Practice Forms"));
		practiceFormLink.click();
		
		WebElement registrationLink=driver.findElement(By.partialLinkText("Register now."));
		//WebElement registrationLink=driver.findElement(By.linkText("Not a member yet? Register now."));
		
		registrationLink.click();
	
		WebElement usernametext=driver.findElement(By.id("user_login"));
		usernametext.sendKeys("alpha");
		
		WebElement useremailtext=driver.findElement(By.id("user_email"));
		useremailtext.sendKeys("alpha@abc.com");
		
		WebElement userpasswordtext=driver.findElement(By.id("user_pass"));
		userpasswordtext.sendKeys("admin");
		
		WebElement userconfirmpasswordtext=driver.findElement(By.id("user_confirm_password"));
		userconfirmpasswordtext.sendKeys("admin");
		//when you are working on attribute and its value
		//then consider xpath on 2nd priority
		//consider cssSelector on 1st priority
		
		//WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement submitButton=driver.findElement(By.cssSelector("button[type='submit']"));
		
		//However xpath is not recommended at initial stage
		//By.xpath("//button[@id='submitbtn']") //few engineers use xpath everywhere
		//By.className("code-toolbar") - it may gives more than one occurrence
		
		submitButton.click();
		
		//to give the pause while page loading
		try{
			Thread.sleep(2000);
			}catch(InterruptedException e) {}
		
		WebElement myAccountLink=driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountLink.click();
	

	}

}
//* practice

//xpath 	: //*[@value='Male']
//CSS 		: *[value='Male']



