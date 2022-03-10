package SeleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Con9 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[@rel='async']")).click();
		      Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kalaivani");
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Natarajan");
			
			//Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select s= new Select(day);
			s.selectByIndex(27);
			
			 WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
			 Select s1= new Select(month);
			 s1.selectByValue("6");
			 
			 WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
			 Select s2 =new Select(year);
			 s2.selectByVisibleText("1998");
			 System.out.println("sucessfully");

	}

}
