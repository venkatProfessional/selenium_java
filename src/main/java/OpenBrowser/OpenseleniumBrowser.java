// File: src/OpenBrowser/OpenseleniumBrowser.java
package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OpenBrowser.Utils.WaitUtils;



public class OpenseleniumBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//     Maximize a browser
       driver.manage().window().maximize(); 
        
//      Append text and press tab
        
        WebElement usernameField = WaitUtils.waitForVisibility(driver, By.xpath("//input[@placeholder='Username']"), 10);
        usernameField.sendKeys("Admin",Keys.TAB);
//        keys.TAB goes to the next textbox

        WebElement passwordField = WaitUtils.waitForVisibility(driver, By.xpath("//input[@placeholder='Password']"), 10);
        passwordField.sendKeys("admin123");
        
//        what inside a text box
       String myplaceholderValue =  driver.findElement(By.name("username")).getAttribute("placeholder");
       System.out.println(myplaceholderValue);
       if(myplaceholderValue.equals("Username")) {
    	   System.out.println("placeholder is correctly mention as user name");
       }
       
       
       
       
       
       
        
       driver.quit();


        // Optionally click login
        // WebElement loginBtn = WebUtils.waitForElementVisible(driver, By.xpath("//button[@type='submit']"), 10);
        // loginBtn.click();
    }
}
