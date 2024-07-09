package activities;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
	
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
	 
	  driver = new ChromeDriver();
	 driver.get("https://v1.training-support.net");
  }
  @Test(priority = 1)
  public void Homepage() {
	  
	//get title of homepage
	  
	  String title = driver.getTitle();
	    System.out.println("Home Page Title is : " + title );
	    Assert.assertEquals("Training Support", title);
	    
	 // click about us
	    
	    driver.findElement(By.id("about-link")).click(); 
	    
	 // print title of result page
	    String resultTitle = driver.getTitle();
	    System.out.println("Result Page Title is : " + resultTitle);
	    Assert.assertEquals("About Training Support", resultTitle);
  }
  @Test(priority = 2)
  
  public  void Resultpage() {
	// print title of result page
	    String resultTitle = driver.getTitle();
	    System.out.println("Result Page Title is : " + resultTitle);
	    Assert.assertEquals("About Training Support", resultTitle);
	  
  }
  

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
