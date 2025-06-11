package OpenBrowser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import OpenBrowser.Utils.WaitUtils;

public class HandleMouseHover {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = WaitUtils.openBrowser("https://www.flipkart.com/");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
//		WebElement fashionMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("")));
		WebElement loginbtnclick = driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		loginbtnclick.click();
		
		WebElement TvAppliances = driver.findElement(By.xpath("//span[normalize-space()='TVs & Appliances']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(TvAppliances).perform();
//		
//		WebElement newlawnches = driver.findElement(By.xpath("//a[@title='New Launches']"));
//		newlawnches.click();
		
		Thread.sleep(40);
		driver.quit();        
	}
}
