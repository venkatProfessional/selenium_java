package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

public class ThrowsExceptional {
	
	public void code() {
		try {
			Thread.sleep(4000);
		}catch (Exception e) {
//			System.out.println(e);
//			all exceptional are class so we call as new
			throw new RuntimeException();
		}
	}
	
	public void throwsuseinselenium() {
		ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/test");
		
		try {
			WebElement w1 = driver.findElement(By.xpath("//h1[normalize-space()='Ready to be a Pro Eng?']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("no element was found");
		}
		
		
	}
	
	public static void main(String[] args) {
		ThrowsExceptional t1 = new ThrowsExceptional();
		t1.code();
		t1.throwsuseinselenium();
	}
}
