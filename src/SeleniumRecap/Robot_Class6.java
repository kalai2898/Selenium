package SeleniumRecap;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Class6 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://paytm.com/");
	driver.manage().window().maximize();
	
	
	WebElement path = driver.findElement(By.xpath("(//div[@class='kfzok'])[1]"));
	
    Actions ac =new Actions(driver);
    
    ac.moveToElement(path).perform();
    Thread.sleep(3000);
    
    Robot r=new Robot();
    
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.KEY_RELEASED);
    
    System.out.println("Robot class success");
	}
}
