package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class LoginTest extends baseclass{
	
	@Given("User is on Login page")
	 public static void Login() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
	 
	  driver = new ChromeDriver();
	  driver.get("https://v1.training-support.net/selenium/login-form");
	 
	 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	@When("User enters username and password")
	public static void enterCredentials() {
		
		WebElement usname =  driver.findElement(By.xpath("//input[@id='username']"));
		  usname.sendKeys("admin");
		  
		  WebElement paswd =  driver.findElement(By.xpath("//input[@id='password']"));
		  paswd.sendKeys("password");
		  
		  driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}
	
	
	@Then("Read the page title and confirmation message")
	public static void ConfirmMsg() {
		
		String message = driver.findElement(By.xpath("//div[@id ='action-confirmation']")).getText();
	       System.out.println("Login message: " + message);
	}
	
	
	@And("Close the Browser")
	public static void close() {
		driver.quit();
		
	}

}
