package activities;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
	WebDriver driver;
	
  @Test(priority = 1)
  public void testcase() {
	  WebElement username = driver.findElement(By.xpath("//input[@id = 'username']"));
	  username.sendKeys("admin");
	  
	  WebElement password = driver.findElement(By.xpath("//input[@id ='password']"));
	  password.sendKeys("password");
	  
	  driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
	 
	  
  }
@Test(priority = 2)
  
  public  void Resultpage() {
	// Print the confirmation message
    String message = driver.findElement(By.xpath("//div[@id ='action-confirmation']")).getText();
    Assert.assertEquals(message , "Welcome Back, admin");
	
}
  
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
	 
	  driver = new ChromeDriver();
	 driver.get("https://v1.training-support.net/selenium/login-form");
	  
	  // get title of homepage
	    System.out.println("Page Title is : " + driver.getTitle());
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  driver.quit();
  }

}
