package activities;

import org.testng.Assert;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {
	WebDriver driver;
  
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
	 
	  driver = new ChromeDriver();
	 driver.get("https://v1.training-support.net/selenium/target-practice");
  }
  @Test(groups = {"Header text" , "Button text"})
  public void displayTitle() {
	  String title = driver.getTitle();
	    System.out.println("Home Page Title is : " + title );
	   
  }
  @Test(dependsOnMethods = {"pageTitleTest"}, groups = {"Header text"})
  public void ThridHeader() {
	//3rd header of the page
	    String Header3 = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
	    Assert.assertEquals("Third header", Header3);
  }
  @Test(dependsOnMethods = {"pageTitleTest"}, groups = {"Header text"})
  public void FifthHeader() {
	//5th header of page and print its color
	    String Header5 = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
      Assert.assertEquals("green",Header5);
  }
  @Test(dependsOnMethods = {"pageTitleTest"},groups = {"Button text"})
  public void Olivebtn() {
	//Voilet color button
	    String olivebtn = driver.findElement(By.xpath("//button[text()='Olive']")).getText();
	    Assert.assertEquals("Olive",olivebtn);
  }
  @Test(dependsOnMethods = {"pageTitleTest"},groups = {"Button text"})
  public void brownbtn() {
	//Voilet color button
	    String brownbtn = driver.findElement(By.xpath("//button[text()='Brown']")).getCssValue("color");
	    Assert.assertEquals("Brown",brownbtn);
  }
  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  driver.quit();
  }

}
