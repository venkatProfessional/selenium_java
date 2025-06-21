package OpenBrowser;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import OpenBrowser.Utils.WaitUtils;

// the explict wait is popularly known as webdriver wait 
public class handleExplictWait {
	public static void main(String[] args) {
		
		ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/waits");
		
		WebElement explictalert = driver.findElement(By.xpath("//button[@id='accept']"));
		explictalert.click();

		
//		Wait until the alert is present 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		The method ExpectedConditions.alertIsPresent() internally does the driver.switchTo().alert() for you.
//		so no need to specifically dont need to switch to alert in this case
		Alert isalertpresent = wait.until(ExpectedConditions.alertIsPresent());
	   
		
	    if (isalertpresent != null) {
            System.out.println("Alert text: " + isalertpresent.getText());
            isalertpresent.accept();
            System.out.println("Alert accepted successfully");
        } else {
            System.out.println("No alert present to accept");
        }
		
		driver.quit();
		
		
		
		
	}
}
