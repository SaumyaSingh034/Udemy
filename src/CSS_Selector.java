import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("Saumya.Singh@gmail.com");
		driver.findElement(By.xpath("//*[contains(@id,'pass')]")).sendKeys("123456789");
		driver.findElement(By.cssSelector("#Login")).click();
		}
}
