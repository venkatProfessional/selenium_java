package OpenBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import OpenBrowser.Utils.WaitUtils;

public class SauceDemoLoginToast {
    public static void main(String[] args) {
        ChromeDriver driver = WaitUtils.openBrowser("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click the button to trigger the auto-closeable success message
        driver.findElement(By.id("autoclosable-btn-success")).click();

        // Wait explicitly for the toast message to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-autocloseable-success")));

        // Print the toast message text
        System.out.println("Toast message: " + toast.getText());

        // Check if the toast is still visible
        try {
            boolean visible = toast.isDisplayed();
            System.out.println("Is toast still visible? " + visible);
        } catch (Exception e) {
            System.out.println("Toast is no longer visible.");
        }

        // Optional: wait and check if toast disappears
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("alert-autocloseable-success")));
            System.out.println("Toast message disappeared.");
        } catch (Exception e) {
            System.out.println("Toast did not disappear in expected time.");
        }

        driver.quit();
    }
}
