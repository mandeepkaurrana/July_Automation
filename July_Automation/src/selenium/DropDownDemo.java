package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/");
			
			driver.manage().window().maximize();
			
			WebElement link=driver.findElement(By.linkText("Dropdown"));
			link.click();
			
			WebElement selectTag=driver.findElement(By.id("dropdown"));
			Select select=new Select(selectTag);
			//select.selectByVisibleText("Option 2");
			select.selectByIndex(2);
					
			
			//for Extra practice, to get all options of select tag
			List<WebElement> options=select.getOptions();
			for(WebElement we:options) {
				System.out.println(we.getText());
			}
			
			
			
	}

}
