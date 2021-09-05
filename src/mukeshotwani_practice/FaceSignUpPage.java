package mukeshotwani_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceSignUpPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//-------Click on Create new Account button----
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.switchTo().activeElement();
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Saumya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8447926710");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("BelieveOnYou@22");
		

	}

}
