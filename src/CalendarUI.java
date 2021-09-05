import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#departureCalendar")).click();
		//Month
		//System.out.println(driver.findElement(By.cssSelector("[class='DayPicker DayPicker--en'] [class='DayPicker-Month'] [class='DayPicker-Caption']")).getText());

		
		
		while(!driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText().contains("September 2021"))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
		//Date-31
		List<WebElement> dates=driver.findElements(By.cssSelector(".DayPicker-Day"));
		int count = driver.findElements(By.cssSelector(".DayPicker-Day")).size();
		for(int i=0;i<count;i++)
		{
			String date = driver.findElements(By.cssSelector(".DayPicker-Day")).get(i).getText();
			if(date.equalsIgnoreCase("25"))
			{
				driver.findElements(By.cssSelector(".DayPicker-Day")).get(i).click();
				break;
			}
		}
		
		

	}

}
