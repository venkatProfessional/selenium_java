package OpenBrowser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

public class HandleimplictWait {
   public static void main(String[] args) {
		ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/");
		
//		implict wait only waits if it finds any error
//		by default selenium has find element has 500ms
//		we can handle the time using the implict wait
	    // Use Duration instead of TimeUnit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
	
//		to quit the driver
		driver.quit();
   }
}
