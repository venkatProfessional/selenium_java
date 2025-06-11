package OpenBrowser;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;

class HandleFrames{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/frame");

		//		  we can also use id or name to switch to frames
		WebElement switchtofirstframe = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
		driver.switchTo().frame(switchtofirstframe);
		WebElement w1 = driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
		w1.sendKeys("helloExample");

		WebElement w2 = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
		w2.sendKeys("helloFramesExample");

		//		  for this frame no name and id available for that we can useXpath
		WebElement switchtoframe2 = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
		driver.switchTo().frame(switchtoframe2);

		WebElement frame2email = driver.findElement(By.name("email"));
		frame2email.sendKeys("frame2emailExample");

		//		Switch to parent frame
		driver.switchTo().parentFrame();
		w1.sendKeys("switchtoparentframe");
		
//		we can also use
//		driver.switchTo().frame(0).switchTo().frame(1)s

		Thread.sleep(3000);

		//		Switch to main frame
		driver.switchTo().defaultContent();
		
//		to maximize the window
//		driver.manage().window().maximize();
		



		driver.quit();
	}

}