package OpenBrowser;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import OpenBrowser.Utils.WaitUtils;

public class HandleDragAndDrop {
//	drag and drop which is inside the action class
    public static void main(String[] args) {
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
}
