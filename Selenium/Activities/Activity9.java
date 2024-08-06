package Training;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity9 {

	static WebDriver 		driver;
	static WebDriverWait 	wait;
	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  // Open the browser
		    driver.get("https://v1.training-support.net/selenium/ajax");
		    
		    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    // print title of result page
		    System.out.println("Result Page Title is : " + driver.getTitle());
		    
		 // Find the button and click it
	        driver.findElement(By.cssSelector("button.violet")).click();
	        // Wait for the new elements to appear
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
	        // Find and print the new text
	        String text = driver.findElement(By.tagName("h1")).getText();
	        System.out.println(text);

	        WebElement delayedText = driver.findElement(By.tagName("h3"));
	        System.out.println(delayedText.getText());
	        // Wait for the delayed text and print it
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
	        String lateText = driver.findElement(By.tagName("h3")).getText();
	        System.out.println(lateText);

	        // Close the browser
	        driver.quit();
	        
	}
		    
}
