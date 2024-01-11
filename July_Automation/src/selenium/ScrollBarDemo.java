package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarDemo {

	public static void main(String[] args) {
		//Scrolling in WebPage
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,400)","");
		
		//Second way:
		
		WebElement link=driver.findElement(By.linkText("Hovers"));
		js.executeScript("arguments[0].scrollIntoView();", link);
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		
		//js.executeScript("document.body.style.zoom = '1.5'");
		
	}

}
