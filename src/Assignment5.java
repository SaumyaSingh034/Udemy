import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[4]//fieldset/label[2]//input")).click();
		String value = driver.findElement(By.xpath("//div[4]/fieldset/label[2]")).getText();
		System.out.println(value);
		driver.findElement(By.id("dropdown-class-example")).click();
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(value);
		driver.findElement(By.cssSelector("#name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		String value1 = driver.switchTo().alert().getText();
		if(value1.contains(value))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Wrong input");
		}
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.close();
		
		
		
		

	}

}
