package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ELLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.encapsulatelogics.com");

		WebElement we = driver.findElement(By.linkText("Practice Forms"));
		we.click();

		WebElement usertextbox = driver.findElement(By.id("log"));
		usertextbox.sendKeys("adminmk");

		WebElement passwordbox = driver.findElement(By.id("pwd"));
		passwordbox.sendKeys("code");

		WebElement loginbutton = driver.findElement(By.name("submit"));
		loginbutton.click();

	}

}
