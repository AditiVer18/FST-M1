package Training;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity8 {
	static WebDriver 		driver;
	static WebDriverWait 	wait;
	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  // Open the browser
		    driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		    
		    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    // print title of result page
		    System.out.println("Result Page Title is : " + driver.getTitle());
		    
		 // Find the toggle button and click it
	        WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));
	        toggleButton.click();
	        
	        // Wait for the toggleButton to disappear
	        WebElement dynamicBox = driver.findElement(By.id("dynamicCheckbox"));
	        wait.until(ExpectedConditions.invisibilityOf(dynamicBox));
	        
	        System.out.println(dynamicBox.isDisplayed());
	        
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
	        
	        // Click the button again
	        toggleButton.click();
	        // Wait for the element to appear
	        wait.until(ExpectedConditions.visibilityOf(dynamicBox));
	        System.out.println(dynamicBox.isDisplayed());
	        
	        
	        
	       // Find the toggle textbox and click it
	        WebElement toggleBox = driver.findElement(By.id("toggleInput"));
	        toggleBox.click();
	        
	     // Wait for the toggletextbox to disappear
	        WebElement inputbox = driver.findElement(By.id("dynamicText"));
	        wait.until(ExpectedConditions.invisibilityOf(inputbox));
	        
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
	        
	     // Click the textbox again
	        toggleBox.click();
	        // Wait for the element to appear
	        wait.until(ExpectedConditions.visibilityOf(inputbox));
	        System.out.println(inputbox.isDisplayed());
	        

	        // Close the browser
	        driver.close();
	        
	        
		    
		  
	}
}
