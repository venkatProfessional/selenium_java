package OpenBrowser;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import OpenBrowser.Utils.WaitUtils;

public class HandleRightClick {
	public static void main(String[] args) throws InterruptedException {
		   ChromeDriver driver = WaitUtils.openBrowser("https://practice.expandtesting.com/context-menu");
		   
		   WebElement RightClick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		   
		   Actions A1 = new Actions(driver);
		   A1.contextClick(RightClick).perform();
		   
		   Thread.sleep(1000);
		   
		  Alert A2 = driver.switchTo().alert();
		  A2.accept();
		   
		   
		   driver.quit();
	}
}
