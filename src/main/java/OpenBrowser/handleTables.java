package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

import OpenBrowser.Utils.WaitUtils;

public class handleTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = WaitUtils.openBrowser("https://letcode.in/waits");
		WebElement tableElement = driver.findElement(By.id("shopping"));
		List<WebElement> insidetable = tableElement.findElements(By.tagName("th"));
		
		for (WebElement webElement : insidetable) {
			System.out.println(webElement.getText());
		}
		
//		 i need a first data of the first row
		
		List<WebElement> tablerowdata = driver.findElements(By.xpath("(//table)[2]//tbody//tr//td[1]"));
		System.out.println(tablerowdata.size());
		
	
		int tablesize = tablerowdata.size();
		
//		Table row data
		if (tablerowdata.size()== 3) {
			System.out.println("Test case passes");
		}else {
			System.out.println("test case failed");
		}
		
		
//		iterate the data take all the table data
		
		for(int i=0;i<tablesize;i++) {
			List<WebElement> iteraterow = tablerowdata.get(i).findElements(By.xpath("(//table)[2]//tbody//tr//td"));
			
			for (WebElement webElement : iteraterow) {
				System.out.println(webElement.getText());
				String validateTextdata = webElement.getText();
				if(validateTextdata.equals("Raj")) {
					WebElement input = iteraterow.get(3).findElement(By.tagName("input"));
					Thread.sleep(500);
					
					input.click();
					break;
				}
			}
		}
		
		
		
		//		quit
		driver.quit();
		
	}

}
