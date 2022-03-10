package SeleniumRecap;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window_Handling {

		public static void main(String[] args) throws InterruptedException, AWTException {
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
			   WebDriver driver =new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.get("https://www.amazon.in/");
			   
			   String handle = driver.getWindowHandle();
			    WebElement path = driver.findElement(By.xpath("//a[text()='Mobiles']"));//text xpath
			    
			    Actions ac =new Actions(driver);
			    
			    ac.contextClick(path).perform();
			    Thread.sleep(3000);
			    Robot rb =new Robot();
			    rb.keyPress(KeyEvent.VK_DOWN);
			    rb.keyPress(KeyEvent.VK_ENTER);
			    
			    WebElement path1 = driver.findElement(By.xpath("//a[contains(text(),' Electronics ')]"));//contains Xpath
			    
			    ac.contextClick(path1).perform();
			    String title = driver.getTitle();
			    System.out.println(title);
			    rb.keyPress(KeyEvent.VK_DOWN);
			    rb.keyPress(KeyEvent.VK_ENTER);
			    
			    WebElement path2 = driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"));
			    ac.contextClick(path2).perform();
			   
			    rb.keyPress(KeyEvent.VK_DOWN);
			    rb.keyRelease(KeyEvent.VK_ENTER);
			    rb.keyPress(KeyEvent.VK_DOWN);
			    rb.keyPress(KeyEvent.VK_ENTER);
			    System.out.println("222222222222222222222222222");
			    
			    Set<String> set = driver.getWindowHandles();
			    for(String opt:set)
			    {
			    	String title2 = driver.switchTo().window(opt).getTitle();
			    	System.out.println(title2);
			    	
			    }
			    driver.switchTo().window(handle);

		}


}


