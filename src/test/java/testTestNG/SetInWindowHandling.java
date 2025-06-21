package testTestNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OpenBrowser.Utils.WaitUtils;

public class SetInWindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WaitUtils.openBrowser("https://letcode.in/window");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Browser launched.");
    }

    @Test
    public void windowhandlingTest() throws InterruptedException {
        handleMultipleWindows();      // If exception occurs, test will fail
        getHeadingOfThePage();       // And still mark test as failed
    }

    private void handleMultipleWindows() throws InterruptedException {
        WebElement openHomeButton = driver.findElement(By.id("home"));
        openHomeButton.click();

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);

        Set<String> allWindowHandles = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(allWindowHandles);

        if (windowList.size() <= 1) {
            throw new RuntimeException("No new window was opened.");
        }

        // Switch to new window
        driver.switchTo().window(windowList.get(1));
        System.out.println("Switched to new window: " + driver.getCurrentUrl());

        // Switch back
        driver.switchTo().window(parentWindow);
        Thread.sleep(1000); // Optional
    }

    private void getHeadingOfThePage() {
        WebElement header = driver.findElement(By.xpath("//h1[normalize-space()='Ready to be a Pro Engineer?']"));
        String headingText = header.getText();
        System.out.println("Heading: " + headingText);

        // Example assertion: fail if heading doesn't match
        if (!headingText.equals("Ready to be a Pro Engineer?")) {
            throw new AssertionError("Heading text did not match expected.");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
