package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement link1=driver.findElement(By.linkText("Frames"));
		link1.click();
		
		WebElement link2=driver.findElement(By.linkText("Nested Frames"));
		link2.click();
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		WebElement middle=driver.findElement(By.id("content"));
		System.out.println(middle.getText());
		
		driver.switchTo().parentFrame();//move to Parent frame
		
		driver.switchTo().frame("frame-right");
		WebElement right=driver.findElement(By.tagName("body"));
		System.out.println(right.getText());
		
		driver.switchTo().defaultContent();//quit to root HTML
		
		
		
		
		
	}

}
