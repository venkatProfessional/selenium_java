package OpenBrowser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

public class interactwithelement {
	public static void main(String[] args) throws InterruptedException {
		
//		we can use active element without using a findelement 
		ChromeDriver driver = WaitUtils.openBrowser("https://www.facebook.com/");
		WebElement active_element = driver.switchTo().activeElement();
		
//		active elements finds the blinking element 
//		the parameter is like character we can do n number of chains 
		active_element.sendKeys("facebook@gmail.com",Keys.TAB,"examplepass",Keys.ENTER);
		
		
//		to sleep and wait		
		Thread.sleep(1000);
		
//		to close the driver
		driver.quit();
		
	}
}
