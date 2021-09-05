import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		Select infact = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		adult.selectByIndex(3);
		child.selectByVisibleText("1");
		infact.selectByValue("2");
		currency.selectByValue("USD");
		
		
	}
	

}
