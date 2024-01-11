package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.encapsulatelogics.com");
		
		//Another way to open the URL and navigate back and forward of webpage
		
		//driver.navigate().to("http://ww.google.com");
		//driver.navigate().back();
		//driver.navigate().forward();
				
		WebElement practiceFormLink=driver.findElement(By.linkText("Practice Forms"));
		practiceFormLink.click();

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("http://www.google.com");
		
		//driver.close();//close a current browser window
		driver.quit();//close all opened browser windows
	}

}
