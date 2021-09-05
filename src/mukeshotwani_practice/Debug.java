package mukeshotwani_practice;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	WebDriver driver = null;
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://cognizant.udemy.com/organization/home/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void test2()
	{
		driver.quit();
	}
	 	
	

}
