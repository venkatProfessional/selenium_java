package OpenBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetcodeEdit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        // Open the browser
        driver.get("https://letcode.in/edit");

        // Maximize the browser
        driver.manage().window().maximize();

        // Wait for the element and enter text
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullName")));
        inputBox.sendKeys("Vijay");
        
        
//        Append a text and press keyboard tab
        driver.findElement(By.id("join")).sendKeys("person",Keys.TAB);
        
//        What is inside the text box
        String insidetext = driver.findElement(By.id("getMe")).getAttribute("value");
        System.out.println(insidetext);
        
//        Clear the text
        driver.findElement(By.id("clearMe")).clear();

//       Confirm edit field is disabled
        boolean checkisenabled = driver.findElement(By.id("noEdit")).isEnabled();
        System.out.println(checkisenabled);
        if(checkisenabled == false) {
        	System.out.println("is enabled test case passed");
        }
        
//      Attribute anga iruntha true nu return pannum
        
       String checkisReadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
       System.out.println(checkisReadonly); 
        
        
        

        // Wait for 3 seconds before quitting the browser
        try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Quit the browser
        driver.quit();
    }
}
