package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

//Exact & Partial Text match using Xpath

//text()		:	//h1[text()='Encapsulate Logics']

//contains()	:	//h1[contains(text(),'Logics')]

//Partial match of attribute value
	//Given : <input placeholder="Enter Useremail here"/> 
	//xpath : //input[contains(@placeholder,'Useremail')]	


//xpath : //div/div/button[@name='']
//css : 	div > div > button[name='']

class ScreenShot{
	public static void clickScreenshot(ChromeDriver driver,String filename) {
		TakesScreenshot ts=driver;

		//it will take screenshot and store in a file object
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		//you will create your own file object with filename, extension and location
		File destfile=new File(".\\screenshots\\"+filename+".png");
		
		//copy source file object in destination file object
		try {
			Files.copy(srcfile, destfile);
		}
		catch(IOException e) {
			
		}

	}
}
public class ScreenShotDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		ScreenShot.clickScreenshot(driver,"GoogleSearchPage");

		driver.get("http://www.facebook.com");
		
		ScreenShot.clickScreenshot(driver,"FBLoginPage");
		
	/*	
		int a1=45;
		//1
		Integer a2=a1;
		String a3=a2.toString();
		System.out.println(a3.length());
		
		//2
		String a4=String.valueOf(a1);
		System.out.println(a4.length());
	*/	
	}

}
