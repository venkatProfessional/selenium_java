package OpenBrowser;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

public class SetInWindowHandling {

	public static void main(String[] args) {
		// Step 1: Launch the browser with the target URL
		WebDriver driver = WaitUtils.openBrowser("https://letcode.in/window");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {
			handleMultipleWindows(driver);
			getheadingOfthepage(driver);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// Step 6: Clean up resources
			driver.quit();
		}
	}

	/**
	 * Handles switching between multiple windows and performs some basic validations.
	 */
	private static void handleMultipleWindows(WebDriver driver) throws InterruptedException {

		// Step 2: Click on the button that opens a new window
		WebElement openHomeButton = driver.findElement(By.id("home"));
		openHomeButton.click();

		// Step 3: Store the parent window handle for future reference
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parentWindow);

		// Step 4: Retrieve all window handles (Set does not maintain order)
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("All Window Handles: " + allWindowHandles);

		// Step 5: Convert Set to List to access via index
		List<String> windowList = new ArrayList<>(allWindowHandles);

		if (windowList.size() > 1) {
			// Switch to the newly opened window (assuming it's at index 1)
			driver.switchTo().window(windowList.get(1));
			System.out.println("Switched to New Window. URL: " + driver.getCurrentUrl());

			// You can perform actions on the new window here...
			

			// Close the current (new) window
//			driver.close();
			System.out.println("Closed the new window.");
		} else {
			System.out.println("No new window was opened.");
		}

		// Step 6: Switch back to parent window
		driver.switchTo().window(parentWindow);
		driver.close();
		
		Set<String> setlist  =driver.getWindowHandles();
		System.out.println("setlist"+setlist);
		
		List<String> changetolist = new ArrayList<String>(setlist);
		
		driver.switchTo().window(changetolist.get(0));
		
		System.out.println(driver.getCurrentUrl());
		
	
		// Optional delay for observing behavior (not recommended in production)
		Thread.sleep(1000);
	}
	
	private static void getheadingOfthepage(WebDriver driver) throws InterruptedException {
		
		WebElement headertext = driver.findElement(By.xpath("//h1[normalize-space()='Ready to be a Pro Engineer?']"));
		System.out.println(headertext.getText());
		
		
	}
	
	
	
	

}
