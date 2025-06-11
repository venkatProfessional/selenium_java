package OpenBrowser;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import OpenBrowser.Utils.WaitUtils;

public class HandleDragandDropBY {
	public static void main(String[] args) {
		ChromeDriver driver = WaitUtils.openBrowser("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		WebElement getattributedrggable = driver.findElement(By.id("draggable"));
		
		int getlocationofX = getattributedrggable.getLocation().getX();
		int getlocationofY = getattributedrggable.getLocation().getY();
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(getattributedrggable, getlocationofX+20, getlocationofY+40).perform();
		
		
		driver.quit();
		
	}
}
