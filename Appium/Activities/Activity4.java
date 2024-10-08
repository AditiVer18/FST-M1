package Activity;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {
	
	AndroidDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.contacts");
		options.setAppActivity("com.android.contacts.activities.PeopleActivity");
		options.noReset();
		
		URL serverUrl = new URL("http://localhost:4723/");
		
		driver = new AndroidDriver(serverUrl ,options );
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	@Test
	public void ContactsTest() {
		
		//driver.findElement(AppiumBy.accessibilityId("Create contact")).click();
		wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Create contact"))).click();
		
		// Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.xpath("//android.widget.EditText[@text=\"First name\"]")
        )).sendKeys("Aadity");
        
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.xpath("//android.widget.EditText[@text=\"Last name\"]")
        )).sendKeys("Varma");
        
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.xpath("//android.widget.EditText[@text=\"Phone\"]")
        )).sendKeys("6574832310");
        
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		// Wait for contact to save
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));
		
		// Assertion
        String contactName = driver.findElement(AppiumBy.id("large_title")).getText();
        Assert.assertEquals(contactName, "Aadity Varma");
    }
	
	
	@AfterClass
	public void tesaDown() {
		driver.quit();
	}
	
}
