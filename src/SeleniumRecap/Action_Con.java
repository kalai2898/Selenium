package SeleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Drag and Drop
public class Action_Con {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println("Browser lanuch Sucessfully");
		
	 Actions ac=new Actions(driver);
	 WebElement drag = driver.findElement(By.id("box6"));
	 WebElement drop = driver.findElement(By.id("box106"));
	  ac.dragAndDrop(drag, drop).perform();
	 
	 Thread.sleep(3000);
	 WebElement drag1 = driver.findElement(By.id("box4"));
	 WebElement drop1 = driver.findElement(By.id("box104"));
	 
	 ac.clickAndHold(drag1).moveToElement(drop1).release(drop1).perform();
	 
	 System.out.println("dropped sucessful");
	 
	 
	 
		
	}
		
	

}
