package Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  // Open the browser
		    driver.get("https://v1.training-support.net/selenium/login-form");
		    
		  // get title of homepage
		    System.out.println("Page Title is : " + driver.getTitle());
		    // click about us
		    
		  WebElement usname =  driver.findElement(By.id("username"));
		  usname.sendKeys("admin");
		  
		  WebElement paswd =  driver.findElement(By.id("password"));
		  paswd.sendKeys("password");
		  
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		// Print the confirmation message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
        File savescreenshotFile = new File("src/main/resources/screenshot.jpg");
        
        FileUtils.copyFile(screenshot, savescreenshotFile);
        driver.quit();
        
     
		   
		    
		   
	}
}
