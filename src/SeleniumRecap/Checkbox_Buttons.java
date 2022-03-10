package SeleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Buttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.seleniumeasy.com/");
		System.out.println("Browser lanuch Sucessfully");
		
		
		Thread.sleep(3000);
		driver.navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		System.out.println("Sucessfully opened");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//Radio Button
		Thread.sleep(2000);
		driver.navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("(//input[@value='Female'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='radio'])[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		
		
		System.out.println("Result");
		
		

	}

}
