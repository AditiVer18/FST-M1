package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity1 {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  // Open the browser
		    driver.get("https://v1.training-support.net");
		    
		  // get title of homepage
		    System.out.println("Home Page Title is : " + driver.getTitle());
		    // click about us
		    
		    driver.findElement(By.id("about-link")).click();
		     
		    // print title of result page
		    System.out.println("Result Page Title is : " + driver.getTitle());
		    
		    driver.quit();
		    
		   
	}

}
