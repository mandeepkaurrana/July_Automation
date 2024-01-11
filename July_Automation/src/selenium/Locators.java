package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//id,name,class,tagname,
//csselector,linktext,partiallinktext,xpath

//<div>Hello</div>
//<span>Bye</span>
//<h1>Encapsulate Logics</h1>
	//By.tagName("h1")
	//By.xpath("//h1[text()='Encapsulate Logics']")
	

//<p>Anjuman</p>
//<button>Submit</button> 

//To locate above tags you want to match their text

//xpath - starts with double slash //

//surround locator in round bracket and fetch using index
	//1.	(//span[text()='Courses'])[2]
    //2. 	//span[text()='Courses']//parent::a
	//3. 	//a//child::span[text()='Courses']
	//4. 	//a/span[text()='Courses']

public class Locators {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://encapsulatelogics.com/");
		
		WebElement we=driver.findElement(By.xpath("//h1[text()='Encapsulate Logics']"));
		String message=we.getText();
		System.out.println(message);

	}

}

//Home work
	//Automatrion Script
		//Practice form click
		//register now
		//fill the form
		//submit the form
		//click my account 
		//get and print message "Welcome <user>" on console

	//Automation Script
		//Practice form click
		//login with username and password
		//goto myaccount
		//click logout
		//confirm logout
		




