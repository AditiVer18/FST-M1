package activities;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.SkipException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
	 
	  driver = new ChromeDriver();
	 driver.get("https://v1.training-support.net/selenium/target-practice");
  }
  @Test
  public void Method1() {
	  String title = driver.getTitle();
	    System.out.println("Home Page Title is : " + title );
	    Assert.assertEquals("Target Practice", title);
  }
  @Test
  public void Method2() {
	  WebElement  blackbtn = driver.findElement(By.className("ui black button"));
	  Assert.assertTrue(blackbtn.isDisplayed());
	  Assert.assertEquals(blackbtn.getText(), "black");
  }
  @Test(enabled = false)
  public void Method3() {
	  String subHeading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
  }
  @Test
  public void Method4() {
	  throw new SkipException("Skipping test case");    
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
