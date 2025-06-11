package OpenBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import OpenBrowser.Utils.WaitUtils;

public class HandleScreenshot {
  public static void main(String[] args) throws IOException {
  
	  ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/button");
	  try {
		    File firstsrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    boolean existscheck = new File("./snaps").mkdirs(); 
		    File dest = new File("./snaps/img.png");
		    FileHandler.copy(firstsrc, dest);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	  
//	  how to take Screenshot for a Specific button
	  
	  try {
		  WebElement ele = driver.findElement(By.id("color"));
		  File eleSrc = ((TakesScreenshot) ele).getScreenshotAs(OutputType.FILE);
		  boolean existscheck = new File("./snaps").mkdirs(); 
		  File eledest = new File("./snaps/img2.png");
		  FileHandler.copy(eleSrc, eledest);
		    
		    
	  }catch (Exception e) {
		// TODO: handle exception
	}
	   
	  
//	  to close the browser
	  driver.quit();
 }
}
