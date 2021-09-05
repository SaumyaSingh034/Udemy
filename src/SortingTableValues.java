import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingTableValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		ArrayList<String> originalList = new ArrayList<String>();
		for(int i=0;i<list.size();i++)
		{
			originalList.add(list.get(i).getText());
		}
		ArrayList<String> copiedList = new ArrayList<String>();
		copiedList.addAll(originalList);
		System.out.println("*********Original List*********");
		for(String s:originalList)
		{
			System.out.println(s);
		}
		Collections.sort(copiedList);
		System.out.println("*******Copied List********");
		for(String s:copiedList)
		{
			System.out.println(s);
		}
		//Assert.assertTrue(copiedList.equals(originalList));
		//Sorting the data in web ade and then check
		ArrayList<String> sorted = new ArrayList<String>();
		int k=1;
		
		driver.findElement(By.xpath("//tr/th[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr/th[2]")).click();
		
		List<WebElement> list1 = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		for(int j =0;j<list1.size();j++)
		{
			 sorted.add(driver.findElements(By.xpath("//tbody/tr/td[2]")).get(j).getText());
		}
		System.out.println("************Sorted List************");
		for(String s: sorted)
		{
			System.out.println(s);
		}
		Assert.assertTrue(copiedList.equals(sorted));

	}

}
