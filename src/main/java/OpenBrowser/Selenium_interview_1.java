package OpenBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

public class Selenium_interview_1 {
	public static void main(String[] args) {
		ChromeDriver driver = WaitUtils.openBrowser("https://cse.google.com/cse?cx=949246a02176b4c10");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement W1 = driver.findElement(By.xpath("//input[@id='gsc-i-id1']"));
		W1.sendKeys("Cricket",Keys.ENTER);
		
		WebElement Robot = driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']"));
		Robot.click();
		
		List<WebElement> cricketwords = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		
		System.out.println(cricketwords.size());
		
		

		
//		for (WebElement cricketcount : cricketwords) {
//			System.out.println(cricketcount.getSize());
//		}
//		
		
	}

}
