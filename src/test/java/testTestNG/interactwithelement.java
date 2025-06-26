package testTestNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import OpenBrowser.Utils.WaitUtils;

// invocation count will duplicate the tests
//Stability or Reliability Testing
//invocation timeout  in 20000 seconds means 20 sec
//in 20 sec all the invocation will be finished with in 20 sec 
//otherwise it shows as a failure and throws the timeout exception

//FAILED: testTestNG.interactwithelement.RunningatestMoreTimes

//parallel iruntha than thread count work 
//invocation timeout invocatio count iruntha thaan work aagum

public class interactwithelement {
	
	@Test(invocationCount = 4,invocationTimeOut = 5000)
	public void RunningatestMoreTimes() throws InterruptedException {
		
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
