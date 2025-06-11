package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import OpenBrowser.Utils.WaitUtils;

public class DriverNavigation {
   public static void main(String[] args) { 
      
//	   driver navigation is nothing but which is cannot access by a dom
	   ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/button");
	   
	   String URL = driver.getCurrentUrl();
	   System.out.println(URL);
	   
	   driver.findElement(By.id("home")).click();
	   
	   String currenthomeUrl = driver.getCurrentUrl();
	   System.out.println(currenthomeUrl);
	   
//	   To navigate to Back
	   driver.navigate().back();

//	   To navigate to forward
//	   driver.navigate().forward();
	   
//	   navigate to another url
	   driver.navigate().to("https://www.google.com/");
	   
	   driver.navigate().back();
	   
//	   and then refresh
	   driver.navigate().refresh();
	   


//	   we can access all the navigation functions 
	   Navigation nav = driver.navigate();
	   nav.back();
	   nav.forward();
	   nav.to("https://www.google.com/");
	   nav.refresh();
	   
//	   To quit A Browser
	   driver.quit();
	   
	   
 }
}
