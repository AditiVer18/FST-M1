package activities;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity7 {
	WebDriver driver;

	
	
	@DataProvider(name = "Authentication")
	public static Object [] [] Credentials()
	{
		return new Object [] [] {
							{"admin" , "password","Welcome Back, admin"},
							{"wrongadmin","wrongpassword","invalid Credentials"}
		};
	}
	
	@Test(dataProvider = "Authentication")
    public void loginTestCase(String username, String password, String ExpectedTest){
        //Find username and pasword fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        
        // clear fields
        usernameField.clear();
        passwordField.clear();
        
        //Enter values in fields
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        
        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, ExpectedTest);

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

