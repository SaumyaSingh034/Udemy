import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingItemstoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] vegetables = { "Brocolli", "Brinjal", "Raspberry" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		// Implict Wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Try Explicit Wait
		WebDriverWait w = new WebDriverWait(driver, 5);

		// Enter Vegetables name

		addItems(driver, vegetables);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		//Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] vegetables) {
		// TODO Auto-generated method stub
		int j = 0;
		

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			// fetching text from UI and spliting it and saving in name array variable
			String[] name = products.get(i).getText().split("-");
			// taking the first half of the String
			String formattedName = name[0].trim();

			// Creating List//convert array into array list for easy search
			List itemsNeededList = Arrays.asList(vegetables);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j == vegetables.length) {
					break;
				}
			}
		}
		

	}

}
