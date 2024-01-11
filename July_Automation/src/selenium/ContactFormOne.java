package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactFormOne {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://encapsulatelogics.com/");

		WebElement we = driver.findElement(By.linkText("Practice Forms"));
		we.click();

		WebElement usertextbox = driver.findElement(By.id("log"));
		usertextbox.sendKeys("adminmk");

		WebElement passwordbox = driver.findElement(By.id("pwd"));
		passwordbox.sendKeys("code");

		WebElement loginbutton = driver.findElement(By.name("submit"));
		loginbutton.click();
		
		WebElement contactForm = driver.findElement(By.xpath("//div[text()='Basic Fields']"));
		contactForm.click();
		
		//Locate all the form fields and Fill desired values
		Thread.sleep(5000);
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		System.out.println(firstName.getText());
		firstName.sendKeys("Mandeep");
		
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		System.out.println(lastName.getText());
		lastName.sendKeys("Kaur Rana");
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		System.out.println(email.getText());
		email.sendKeys("man@test.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phone.sendKeys("9825422655");
		
		WebElement subject = driver.findElement(By.xpath("//input[@placeholder='Subject']"));
		subject.sendKeys("Java");
		
		WebElement message = driver.findElement(By.xpath("//div//textarea[@placeholder='Your message']"));
		message.sendKeys("I am interested to join your Java course.");
		
		WebElement submit = driver.findElement(By.id("gform_submit_button_1"));
		submit.click();
		
		WebElement successMessage= driver.findElement(By.xpath("//div//textarea[@placeholder='Your message']"));
		String msg=successMessage.getText();
		System.out.println(msg);
		
		System.out.println("Congratulations! Successfully filled Contact Form 1");

	}

}
