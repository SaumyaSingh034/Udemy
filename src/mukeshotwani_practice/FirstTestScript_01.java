package mukeshotwani_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestScript_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("singhsaumyaps21@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("951005896");
		driver.findElement(By.id("u_0_d")).click();
		

	}

}
