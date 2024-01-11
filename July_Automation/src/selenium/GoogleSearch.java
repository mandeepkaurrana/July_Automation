package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement we = driver.findElement(By.id("APjFq"));
		we.sendKeys("best java institute in Brampton");
		we.sendKeys(Keys.ENTER);

	}

}
