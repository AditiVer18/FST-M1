package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00111T744\\Desktop\\Training Material\\Selinium\\eclipse\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  // Open the browser
		    driver.get("https://v1.training-support.net/selenium/target-practice");
		    
		  // get title of homepage
		    System.out.println("Page Title is : " + driver.getTitle());
		    
		    //3rd header of the page and print its text
		    String Header3 = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		    System.out.println("Test of Header 3 is : " + Header3);
		    
		    //5th header of page and print its color
		    String Header5 = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
		    System.out.println("Color of Header 5 is : " + Header5);
		    
		    //Voilet color button
		    String violetbtn = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
		    System.out.println("Class of violet button : " + violetbtn);
		    
		  //Voilet color button
		    String greybtn = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
		    System.out.println("Text on grey button : " + greybtn);
		    
		    driver.quit();
		}
}
