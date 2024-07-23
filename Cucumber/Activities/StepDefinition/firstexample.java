package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.Assert;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class firstexample extends baseclass{
	
	@BeforeAll
	 public static void openbrowser() {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		  driver = new ChromeDriver();
		 driver.get("https://v1.training-support.net");
		 
		 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  
		  // get title of homepage
		    System.out.println("Page Title is : " + driver.getTitle());
	  }
	
	@AfterAll
	public static void closebrowser() {
		driver.quit();
	}
	
	@Given("the user is on TS home page")
	public void openTShomepage() {
		
		 String title = driver.getTitle();
		 System.out.println("Home Page Title is : " + title );
		 org.junit.Assert.assertEquals("Training Support", title);
	}

	@When("the user clicks on about us link")
	public void clickoaboutus() {
		// click about us
	    
	    driver.findElement(By.id("about-link")).click(); 
	}

	@Then("the user is redirected to about us page")
	public void verifyaboutuspage() {
		// print title of result page
	    String resultTitle = driver.getTitle();
	    System.out.println("Result Page Title is : " + resultTitle);
	    Assert.assertEquals("About Training Support", resultTitle);
		
	}

}
