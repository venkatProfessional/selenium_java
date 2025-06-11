package OpenBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

public class HandleAlerts {
   public static void main(String[] args) throws InterruptedException {
	
	   ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/alert");
	   
//	   it is an simple alert using frames
//	   WebElement ele = driver.findElement(By.id("accept"));
//	   ele.click();
//	   
//	   Thread.sleep(3000);
//	   
////	   use need to use switch function to switch to one frame to another frame	
//	   Alert alert = driver.switchTo().alert();
//	   String getTextOfAlert = alert.getText();
//	   System.out.println(getTextOfAlert);
////	   Hey welcome to letcode willl be printed
////	   to accept the alert
//	   try {
//		   alert.accept();
////		   alert.dismiss();
////	 also there is a function called dismiss  
////   it also do a same action
//	   }catch(Exception e) {
//		   System.out.println("alert is not accepted"+e);
//	   }
//	   
////	   confirm alert
//	   
	 
	   
//	   prompt based alert
	   
	   WebElement ele2 = driver.findElement(By.id("prompt"));
	   ele2.click();
	   Alert a1 = driver.switchTo().alert();
	   a1.sendKeys("Rangaraya sakthivel");
	   a1.accept();
	  
	   Thread.sleep(3000);
	   
//	   to get a text of the 
	   
	   String alerttext = driver.findElement(By.id("myName")).getText();
	   System.out.println(alerttext);
	   
	   
	   
//	   
	   
	
	   
	   
	   
//	   to quit a driver
	   driver.quit();
  }
}
