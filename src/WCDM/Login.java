package WCDM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args)	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Trening\\QA Automation\\Chrome100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tim-dev.zira:28080/billing/dispute/dispute-acquisition");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("aa");		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("aa");
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class=\"submitlogin text-center\"]")).click();
		//String actual = driver.findElement(By.id("g2599-email")).getText();
		//Assert.assertEquals(actual, "damir.begic86@gmail.com");
	}

}
