// File: WaitUtils.java
package OpenBrowser.Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils2 {

    public static WebElement waitForVisibility(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // You can add more common wait methods here if needed (e.g., clickability, presence, etc.)
    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static ChromeDriver openBrowser(String url) {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser window
//        driver.manage().window().maximize();

        // Navigate to the provided URL
        driver.get(url);

        // Return the driver instance for further use
        return driver;
    }
    
    public static void quit(ChromeDriver driver) {
        try {
            Thread.sleep(3000); // Wait for 3 seconds before quitting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Quit the browser
        driver.quit();
    }
    
}
