package testTestNG.ExcelHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testTestNG.DataUtils;

public class LoginTest {

    @Test(dataProvider = "hrmLoginData", dataProviderClass = DataUtils.class)
    public void testLogin(String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000); // small wait to let page load

        WebElement userField = driver.findElement(By.name("username"));
        WebElement passField = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        userField.sendKeys(username);
        passField.sendKeys(password);
        loginBtn.click();

        Thread.sleep(3000); // wait to check login

        // Validate login
        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("Login successful for: " + username);
        } else {
            System.out.println("Login failed for: " + username);
        }

        driver.quit();
    }
}
