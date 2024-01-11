package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement link1=driver.findElement(By.linkText("Frames"));
		link1.click();
		
		WebElement link2=driver.findElement(By.linkText("iFrame"));
		link2.click();
		
		driver.switchTo().frame("mce_0_ifr");
			
		//WebElement ptext=driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		
		WebElement ptext=driver.findElement(By.cssSelector("body[id='tinymce']>p"));
		ptext.clear();
		ptext.sendKeys("I am good");
		
		
	}

}
