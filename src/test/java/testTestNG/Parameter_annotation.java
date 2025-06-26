package testTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OpenBrowser.Utils.WaitUtils;

//getting parameter from parameter.xml
//not to sun this page
//run using only an XML

public class Parameter_annotation {
	RemoteWebDriver driver = null;
	@Parameters({"username","password","browser"})
	@Test
	public void data_handling_from_XML(String username ,String password,String browser) {
		switch (browser) {
		case "chrome":
		   driver = new ChromeDriver();
			break;

		case "firefox":
			  driver = new FirefoxDriver();
			break;
		default:
			System.err.println("error occured");
			break;
		}

		//	 it takes as a sequence first value as first second value as second

//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Maximize the browser window
		driver.manage().window().maximize(); 

		// Wait for username field and enter text
		WebElement usernameField = WaitUtils.waitForVisibility(driver, By.xpath("//input[@placeholder='Username']"), 10);
		usernameField.sendKeys(username, Keys.TAB);  // Presses TAB to switch to password field

		// Wait for password field and enter password
		WebElement passwordField = WaitUtils.waitForVisibility(driver, By.xpath("//input[@placeholder='Password']"), 10);
		passwordField.sendKeys(password);

		// Validate placeholder value
		String placeholderValue = driver.findElement(By.name("username")).getAttribute("placeholder");
		System.out.println("Placeholder: " + placeholderValue);

		if (placeholderValue.equals("Username")) {
			System.out.println("Placeholder is correctly mentioned as 'Username'");
		} else {
			System.out.println("Placeholder mismatch!");
		}

		// Close browser
		driver.quit();
	}
}
