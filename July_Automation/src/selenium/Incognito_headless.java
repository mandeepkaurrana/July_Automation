package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_headless {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--incognito");
		options.addArguments("--headless");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		

	}

}
