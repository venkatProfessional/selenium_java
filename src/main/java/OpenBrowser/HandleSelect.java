package OpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import OpenBrowser.Utils.WaitUtils;
	
public class HandleSelect {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = WaitUtils.openBrowser("https://letcode.in/dropdowns");

		WebElement fruitsSelect = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s1 = new Select(fruitsSelect);
		s1.selectByVisibleText("Mango");

		Thread.sleep(1000);
		s1.selectByValue("3");

		WebElement progaramminglanguages = driver.findElement(By.xpath("//select[@id='lang']"));
		Select programmingSelect = new Select(progaramminglanguages);

		programmingSelect.selectByIndex(2);
		WebElement fso = programmingSelect.getFirstSelectedOption();
		System.out.println(fso.getText());
		Thread.sleep(1000);

		//		Handling multiple dropdown

		WebElement multipledropdown = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select selectmultipleselect = new Select(multipledropdown);
		selectmultipleselect.selectByIndex(0);
		selectmultipleselect.selectByIndex(2);
		selectmultipleselect.selectByVisibleText("Black Panther");
		selectmultipleselect.deselectByIndex(2);
		List<WebElement> allheros = selectmultipleselect.getAllSelectedOptions();
		for (WebElement hero : allheros) {
		    System.out.println(hero.getText());
		}
		Thread.sleep(1000);

		driver.quit();
	}
}
