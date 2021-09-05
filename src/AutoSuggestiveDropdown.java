import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.txw2.Document;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		Thread.sleep(2000);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(value);
		int i = 0;

		while(!text.contains("AIRPORT"))
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(value);
			System.out.println(text);
			
			if(i>6)
			{
				break;
			}
		}
		System.out.println(i);
		if(i>6)
		{
			System.out.println("Item not found");
		}
		
		
		
		
		
	}

}
