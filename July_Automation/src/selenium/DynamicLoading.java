package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
class SeleniumWait{
	public static WebElement waitForElementVisibility(ChromeDriver driver,By locator,long seconds) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		//it will wait for 4seconds for the visibility of Hello World Locator
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
}
public class DynamicLoading {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement link=driver.findElement(By.linkText("Dynamic Loading"));
		link.click();
	
		WebElement examplelink=driver.findElement(By.partialLinkText("Example 1"));
		examplelink.click();
	
		WebElement startbutton=driver.findElement(By.xpath("//button[text()='Start']"));
		startbutton.click();
		
		//WebElement helloWorld=driver.findElement(By.xpath("//div[@id='finish']/h4"));
		WebElement we=SeleniumWait.waitForElementVisibility(driver,By.xpath("//div[@id='finish']/h4"), 6);
		
		System.out.println(we.getText());
		
		
	}

}
