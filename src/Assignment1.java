import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input[id*='Option1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='Option1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
		System.out.println("Count of Checkboxes are = "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		

	}

}
