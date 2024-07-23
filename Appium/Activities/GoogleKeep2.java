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

public class GoogleKeep2 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
    	UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.keep");
		options.setAppActivity(".activities.BrowseActivity");
		options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Test method
    @Test
    public void TaskAdd() {
    	
    	// Create new task
    	wait.until(ExpectedConditions.elementToBeClickable(
    			AppiumBy.accessibilityId("New text note"))).click();
    	
    	 wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("editable_title")));
    	 
    	 driver.findElement(AppiumBy.id("editable_title")).sendKeys("Test Note");
    	 driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("This is first Test Note");

    	 driver.findElement(AppiumBy.accessibilityId("Reminder")).click();
    	 
    	 
    	 driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Tomorrow morning\")")).click();
    	 
    	 driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
    	 
    	 String Note = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/index_note_title\" and @text=\"Test Note\"]\r\n"
     	 		+ "")).getText();
     	 
     	// Assertion
          Assert.assertEquals(Note, "Test Note");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
