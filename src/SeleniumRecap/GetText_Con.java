package SeleniumRecap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetText_Con {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.seleniumeasy.com/");
		System.out.println("Browser lanuch Sucessfully");
		
		driver.navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		WebElement find = driver.findElement(By.id("multi-select"));
		Select s=new Select(find);
		boolean multiple = s.isMultiple();
		System.out.println("multiple :"+multiple);
		
		List<WebElement> list = s.getOptions();
		for(WebElement op: list) {
			String text = op.getText();
		
			System.out.println(text);
			
			
		}	
			
		int size= list.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			if(i==2||i==4)
			{
				s.selectByIndex(i);
				
			}
		}
	
	}

}
