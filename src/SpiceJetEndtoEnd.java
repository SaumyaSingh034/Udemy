import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetEndtoEnd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(3000);

		
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"))
		{
			System.out.println("Its disbaled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo'] ")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult']")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("2");
		

	}

}
