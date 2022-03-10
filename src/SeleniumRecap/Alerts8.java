package SeleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts8 {

	
		public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
					
					WebDriver driver =new ChromeDriver();
					
					driver.get("http://demo.automationtesting.in/Alerts.html");
					driver.manage().window().maximize();
					
					driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
					Thread.sleep(3000);
					driver.switchTo().alert().accept();
					

	}

}
