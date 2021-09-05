import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='Adults']")).click();
		Select adult = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		adult.selectByValue("2");
		driver.findElement(By.xpath("//select[@id='Childrens']")).click();
		Select child = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
		child.selectByValue("1");
		driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.cssSelector("#SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
