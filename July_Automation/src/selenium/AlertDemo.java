package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement link=driver.findElement(By.linkText("JavaScript Alerts"));
		link.click();
	
		WebElement button=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		button.click();
	
		Alert alertObj=driver.switchTo().alert();
		String alertMessage=alertObj.getText();
		alertObj.accept();
		
		System.out.println(alertMessage);
		//alertObj.dismiss();			//to click cancel
		//alertObj.sendKeys("");		//to enter data in text box of alert
		if(alertMessage.equals("I am a JS Alert"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		
		}

}
