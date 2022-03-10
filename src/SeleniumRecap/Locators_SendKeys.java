package SeleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_SendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Browser lanuch Sucessfully");
		
		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		element.sendKeys("7401511522");
		WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
		element2.sendKeys("kalai1998");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		System.out.println("login Successfully");

	}

}
