package Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7 {

	static WebDriver 		driver;
	static WebDriverWait 	wait;
	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  // Open the browser
		    driver.get("https://v1.training-support.net/selenium/drag-drop");
		    
		    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    // print title of result page
		    System.out.println("Result Page Title is : " + driver.getTitle());
		    
		    // Creating Action object for handling events
		    Actions builder = new Actions(driver);
		  
		WebElement football = driver.findElement(By.id("draggable")) ;
		WebElement dropzone1 = driver.findElement(By.id("droppable")) ;
		WebElement dropzone2 = driver.findElement(By.id("dropzone2")) ;
		   
		// Perform drag and drop to dropzone 1
	builder.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();
	 // Verify that the ball was dropped in dropzone 1
    String dropzone1Verify = dropzone1.findElement(By.tagName("p")).getText();
    
    if(dropzone1Verify.equals("Dropped!")) {
        System.out.println("Ball was dropped in dropzone 1");
    }

    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    
 // Perform drag and drop to dropzone 2
    builder.dragAndDrop(football, dropzone2).pause(2000).build().perform();
    // Verify that the ball was dropped in dropzone 2
    String dropzone2Verify = dropzone2.findElement(By.tagName("p")).getText();
    if(dropzone2Verify.equals("Dropped!")) {
        System.out.println("Ball was dropped in dropzone 2");
    }

    // Close the browser
    driver.close();
	}
}
