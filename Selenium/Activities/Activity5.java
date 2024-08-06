package Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity5 {
	
	static WebDriver 		driver;
	static WebDriverWait 	wait;
	
	public static void main(String[] args) {
		
		String frontText;
		
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
		    
		    //Perform left click
		    builder.click().pause(1000).build().perform();
		 // Print the front side text
		   frontText = driver.findElement(By.className("active")).getText();
		    System.out.println("Front Text is : " + frontText);
		    
		    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    
		  //Perform double click
		
		    builder.doubleClick().pause(1000).build().perform();
		     frontText = driver.findElement(By.className("active")).getText();
		    System.out.println("Front Text is : " + frontText);
		    
		    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    
		    //Perform right click
		    builder.contextClick().pause(1000).build().perform();
		     frontText = driver.findElement(By.className("active")).getText();
		    System.out.println("Front Text is : " + frontText);
		    
		    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    
		    driver.quit();
		}
}
