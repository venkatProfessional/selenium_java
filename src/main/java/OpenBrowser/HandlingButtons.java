package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

public class HandlingButtons {
  public static void main(String[] args) {
	   ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/button");
	   
//	   	get X and Y coordinates
	   driver.findElement(By.id("position")).getLocation();
	   
//	   webelement is not a class it is interface	
	   WebElement ele = driver.findElement(By.id("position"));
	   Point point = ele.getLocation();
	   int x = point.getX();
	   int y = point.getY();
	   
	   System.out.println("X=>"+x);
	   System.out.println("y=>"+y);
	   
//	   find the color of the element
	    
	   WebElement btncolor = driver.findElement(By.id("color"));
	   String color = btncolor.getCssValue("background-color");
	   btncolor.getCssValue(color);
	   System.out.println(color);
	   
//	   Find the height & width of the button
	   
	   WebElement findWH = driver.findElement(By.id("property"));
	   Dimension DH = findWH.getRect().getDimension();
	   System.out.println(DH);
	   
//	   result of the code
//	   X=>123
//	   y=>336
//	   rgba(42, 157, 144, 1)
//	   (174, 40)
//	   
	   
	   
	   
	   
	   
//	   To quit A Browser
	   WaitUtils.quit(driver);
 }
}
