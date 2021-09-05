import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		//Size of Column
		int colCount = table.findElements(By.tagName("th")).size();
		System.out.println(colCount);
		//SIze of rows
		int rowCount = table.findElements(By.tagName("tr")).size();
		System.out.println(rowCount);
		//Print 2nd row
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]")).getText());
		

	}

}
