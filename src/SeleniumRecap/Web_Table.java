package SeleniumRecap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.w3schools.com/html/html_tables.asp");
		   
		  List<WebElement> find = driver.findElements(By.xpath("//*[@id=\"main\"]/div[3]/div"));
		  
		  for(WebElement op:find)
		   {
			   String text = op.getText();
			   System.out.println(text);
		   }
		   

	}

}
