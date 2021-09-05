import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Count number of links for whole web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Count number of links for footer page
		WebElement footDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footDriver.findElements(By.tagName("a")).size());
		//Count number of links present of 1st section of footer
		
		WebElement colDriver = footDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(colDriver.findElements(By.tagName("a")).size());
		//Click on each link
		for(int i=0;i<colDriver.findElements(By.tagName("a")).size();i++)
		{
			String onClick = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
		
			colDriver.findElements(By.tagName("a")).get(i).sendKeys(onClick);
		}
		//get url of each tab
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		while(id.hasNext())
		{
		
			driver.switchTo().window(id.next());
			System.out.println(driver.getTitle());
			
		}
		
	
		

	}

}
