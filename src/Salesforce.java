import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abcde"); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abdbdbbddd");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
		

	}

}
