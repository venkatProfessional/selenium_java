package testTestNG;

import java.awt.Desktop.Action;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import OpenBrowser.Utils.WaitUtils;

//thread pollsize make a run in parallel
// motha sequel la onnu onna run agum 
// thread pool size parallel la ella side u run agum

public class ThreadPoolSize {
//	drag and drop which is inside the action class
	
	@Test(invocationCount = 3, threadPoolSize = 3)
    public void ExampleThreadPoolSize() {
        ChromeDriver driver = null;

        try {
            driver = WaitUtils.openBrowser("https://jqueryui.com/droppable/");
            
            // Switch to frame by index (recommended to use name or WebElement for stability)
            driver.switchTo().frame(0);
            
            // Locate the drop target element
            WebElement dropHere = driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));
            String dropText = dropHere.getText();

            System.out.println("Drop area text: " + dropText);

            // Validate text inside the drop area
            if ("Drop here".equals(dropText)) {
                System.out.println("✅ Successfully switched to the frame and found the drop area.");
            } else {
                System.out.println("❌ Text mismatch. Possibly not inside the correct frame.");
            }

        } catch (Exception e) {
            System.err.println("⚠️ Exception occurred: " + e.getMessage());
            e.printStackTrace();
        } 
        
        WebElement draggableElement = driver.findElement(By.id("draggable"));
        WebElement droppableElement = driver.findElement(By.id("droppable"));
        
        Actions builder = new Actions(driver);
        builder.dragAndDrop(draggableElement, droppableElement).perform();
        
        
        
        if (driver != null) {
            driver.quit();
        
        }
    }
	
//	eg ithu 5 seconda la run agum nu vachukuvom
//	but timeout la  3 sec kulla execute aagla naa exception varum 
//	it throws an exception thread timeout exception 
//	itha mosta edhuku use pannuvanga na ipa oru build vanthu open panrom naa adhu ethana second
//	kulla load aaganum nu irukum la adhuku than 
	
	@Test(timeOut = 3000)
	public void TimeoutExample() {
		System.out.println(" it is an example for timeout");
	}
	
//	 oru exception varun nu theriyum adha epdi ignore panrathu
//	 s vanthu plural la vanthuchu naa adhu array or list taa than irukum
//	 it is does not throw as failure	
	@Test(expectedExceptions = {NoSuchElementException.class})
	public void expectedConditions() {
		System.out.println("checking expected expctions ");
		throw new NoSuchElementException();
	}
	
}
