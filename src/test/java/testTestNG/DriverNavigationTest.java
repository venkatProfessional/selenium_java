package testTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OpenBrowser.Utils.WaitUtils;

public class DriverNavigationTest {

    ChromeDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WaitUtils.openBrowser("https://letcode.in/button");
    }

    @Test
    public void testNavigation() {

        String URL = driver.getCurrentUrl();
        System.out.println("Initial URL: " + URL);

        driver.findElement(By.id("home")).click();
        String currentHomeUrl = driver.getCurrentUrl();
        System.out.println("After clicking Home: " + currentHomeUrl);

        // Navigate back
        driver.navigate().back();

        // Navigate to another URL
        driver.navigate().to("https://www.google.com/");

        // Navigate back and refresh
        driver.navigate().back();
        driver.navigate().refresh();

        // Using Navigation interface
        Navigation nav = driver.navigate();
        nav.back();
        nav.forward();
        nav.to("https://www.google.com/");
        nav.refresh();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
