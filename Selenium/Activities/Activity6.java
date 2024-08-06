package Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6 {

	static WebDriver 		driver;
	static WebDriverWait 	wait;
	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  // Open the browser
		    driver.get("https://v1.training-support.net/selenium/input-events");
		    
		    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    // print title of result page
		    System.out.println("Result Page Title is : " + driver.getTitle());
		    
		    // Creating Action object for handling events
		    Actions builder = new Actions(driver);
		  
		 //Type 1st letter of name
		    builder.sendKeys("A").build().perform();
		    wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		    
		    // Press CTRL+A and CTRL+C
		    builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    
		    driver.quit();
		    
	}
}
