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

public class Googletask {
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
		options.setAppPackage("com.google.android.apps.tasks");
		options.setAppActivity(".ui.TaskListsActivity");
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
    			AppiumBy.accessibilityId("Create new task"))).click();

        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("add_task_title")
        )).click();

        // Find the element to add activity
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google task");
        //Save task
        driver.findElement(AppiumBy.id("add_task_done")).click();
        
     // Create new task
    	wait.until(ExpectedConditions.elementToBeClickable(
    			AppiumBy.accessibilityId("Create new task"))).click();
    	//Add task
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("add_task_title")
        )).click();
        
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Keep");
        // save task
        driver.findElement(AppiumBy.id("add_task_done")).click();
        
     // Create new task
    	wait.until(ExpectedConditions.elementToBeClickable(
    			AppiumBy.accessibilityId("Create new task"))).click();
    	//Add task
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("add_task_title")
        )).click();
        
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete second Activity with Google task");
        // save task
        driver.findElement(AppiumBy.id("add_task_done")).click();
        
        String task1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Complete Activity with Google task\")")).getText();
        Assert.assertEquals(task1, "Complete Activity with Google task");
        
        String task2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Complete Activity with Google Keep\")")).getText();
        Assert.assertEquals(task2, "Complete Activity with Google Keep");
        
       
        String task3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Complete second Activity with Google task\")")).getText();
        Assert.assertEquals(task3, "Complete second Activity with Google task");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
