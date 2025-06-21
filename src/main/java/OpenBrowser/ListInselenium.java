package OpenBrowser;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

public class ListInselenium {
	public static void main(String[] args) {
		ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/edit");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> labels = driver.findElements(By.tagName("label"));

		for (WebElement webElement : labels) {
			System.out.println(webElement.getText());
		}
		
		System.out.println(labels.size()-1);
		
		 int lastelement = labels.size()-1;
		// Get the last element
		 WebElement lastElement = labels.get(lastelement);
		// Print its text
		 System.out.println("Last element text: " + lastElement.getText());
		 
		 if(labels.size()==6) {
			 System.out.println("the length of the label test case is passed");
		 }else {
			 System.out.println("The test case failed");
		 }

		 
		
		
		driver.quit();



	}

}
