package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class TestingAlerts extends baseclass {
	static Alert alert;
	
	@Given("User is on the page")
	public static void get() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://v1.training-support.net/selenium/javascript-alerts");
	 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	

	@When("User clicks the Simple Alert button")
	public static void simpleAlertButton() {
		driver.findElement(By.cssSelector("#simple")).click();
	}
	
	@When("User clicks the Confirm Alert button")
	public static void confirmAlertButton() {
		driver.findElement(By.cssSelector("#confirm")).click();
	}
	
	@When("User clicks the Prompt Alert button")
	public static void promptAlertButton() {
			driver.findElement(By.cssSelector("#prompt")).click();
	}
	
	@Then("Alert opens")
	public static void alertOpen() {
		alert = driver.switchTo().alert();
		
	}
	
	@And("Read the text from it and print it")
	public static void readTextFromAlert() {
		 System.out.println("Alert says: " + alert.getText());
		
	}
	@And("Close the alert with Cancel")
	public static void closeAlertwithCancel() {
		 alert.dismiss();
	}
	
	@And("Write a custom message in it")
	public static void writeCustomMsg() {
		alert.sendKeys("Custom Message");
		
	}
	
	@And("Close the alert")
	public static void closeAlert() {
		alert.accept();
	}
	
	@And("Read the result text")
	public static void readResultText() {
		System.out.println("Alert says: " + alert.getText());
		
	}
	
	
	@And("Close Browser")
	public static void close() {
		driver.quit();
		
	}

}
