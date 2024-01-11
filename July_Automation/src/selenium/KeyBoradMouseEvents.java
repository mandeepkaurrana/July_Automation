package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoradMouseEvents {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.linkText("Hovers"));
		link.click();
		
		WebElement imglink=driver.findElement(By.xpath("(//div[@class='figure']/img)[3]"));
		WebElement imgcaption=driver.findElement(By.xpath("(//div[@class='figcaption']/h5)[3]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(imglink).build().perform();
		

		
		String caption=imgcaption.getText();
		System.out.println(caption);
		//sometime you need to execute a sequence of methods in Actions class
		//so finally you have to call build and perform method on that sequence
		
		//You can try Context menu in internet Herokaupp
		//and try your code like following commands
		//Actions action= new Actions(driver);
		//action.contextClick(productLink)
			//.sendKeys(Keys.ARROW_DOWN)
			//.sendKeys(Keys.ARROW_DOWN)
			//.sendKeys(Keys.RETURN)
			//.build().perform();
		
	}

}
