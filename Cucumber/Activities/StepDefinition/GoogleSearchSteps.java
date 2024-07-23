package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import io.cucumber.java.en.*;

public class GoogleSearchSteps extends baseclass{
	
	@Given("User is on Google Home Page")
	public void googlehomePage() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
	 
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	 
	 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
	}
	
	 @When("User types in Cheese and hits ENTER")
	 public void usertypeCheese() throws Throwable {
	        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
	    }
	
	 @Then("Show how many search results were shown")
	 public void showSearchresult() {
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
		 String resultStats = driver.findElement(By.id("result-stats")).getText();
		 System.out.println("Number of results found: " + resultStats);
		}
	 @And("Close the browser")
	 public static void closebrowser() {
			driver.quit();
		}
}
