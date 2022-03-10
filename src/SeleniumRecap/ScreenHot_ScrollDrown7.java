package SeleniumRecap;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenHot_ScrollDrown7 {

	public static void main(String[] args) throws WebDriverException, InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		System.out.println("Browser lanuch Sucessfully");
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(3000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\snap\\amzon.png");
		FileUtils.copyFile(src, des);
		System.out.println("copied");
		
		driver.navigate().to("https://meesho.com/");
		
		driver.manage().window().maximize();
		
		WebElement down = driver.findElement(By.xpath("//div[@class='content']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", down);
		
		
	/*	Thread.sleep(3000);
		WebElement up = driver.findElement(By.xpath("//div[@class='HomeBannerUno__HomeBannerUnoWrapper-sc-11gifml-0 iaCtdp']"));
		js.executeScript("arguments[0].scrollIntoView();", up);
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -3000);");*/
		

	}

}
