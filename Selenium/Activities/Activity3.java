package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  // Open the browser
		    driver.get("https://v1.training-support.net/selenium/login-form");
		    
		  // get title of homepage
		    System.out.println("Page Title is : " + driver.getTitle());
		 
		    
		  WebElement usname =  driver.findElement(By.xpath("//input[@id='username']"));
		  usname.sendKeys("admin");
		  
		  WebElement paswd =  driver.findElement(By.xpath("//input[@id='password']"));
		  paswd.sendKeys("password");
		  
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		// Print the confirmation message
       String message = driver.findElement(By.xpath("//div[@id ='action-confirmation']")).getText();
       System.out.println("Login message: " + message);
		  
		  
		    
		    driver.quit();
		 	    
		    
		   
	}
}
