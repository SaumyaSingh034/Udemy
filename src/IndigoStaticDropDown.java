import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndigoStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Indigo");
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".LC20lb.DKV0Md")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='passenger']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@class='icon-plus']")).click();
		 
		//driver.switchTo().alert().accept();
		 
		 Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}

}
