package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserAndWebSite {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.encapsulatelogics.com");

	}

}
