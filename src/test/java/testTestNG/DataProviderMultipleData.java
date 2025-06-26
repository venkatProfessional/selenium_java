package testTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import OpenBrowser.Utils.WaitUtils;

public class DataProviderMultipleData extends DataUtils {
//	 we can also take a data from another file DataProviderFile 

    RemoteWebDriver driver = null;

//    @DataProvider(name = "loginData")
//    public Object[][] loginTestData() {
//        return new Object[][] {
//            // Positive Test Case
//            {"Admin", "admin123", "chrome"},
//            // Negative Test Cases
//            {"Admin", "wrongpass", "chrome"},    // invalid password
//            {"wronguser", "admin123", "firefox"},// invalid username
//            {"", "admin123", "chrome"},          // empty username
//            {"Admin", "", "firefox"},            // empty password
//            {"", "", "chrome"}                   // both fields empty
//        };
//    }

    @Test(dataProvider = "negativeLoginData",dataProviderClass = DataUtils.class)
    public void multipleDataHandling(String username, String password, String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.err.println("Unsupported browser: " + browser);
                return;
        }

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement usernameField = WaitUtils.waitForVisibility(driver, By.xpath("//input[@placeholder='Username']"), 10);
        usernameField.sendKeys(username, Keys.TAB);

        WebElement passwordField = WaitUtils.waitForVisibility(driver, By.xpath("//input[@placeholder='Password']"), 10);
        passwordField.sendKeys(password);

        // Print placeholder validation
        String placeholderValue = driver.findElement(By.name("username")).getAttribute("placeholder");
        System.out.println("Placeholder: " + placeholderValue);

        if ("Username".equals(placeholderValue)) {
            System.out.println("Placeholder is correct.");
        }

        // Optionally check login success/failure here by checking URL, error messages, etc.

        driver.quit();
    }
}
