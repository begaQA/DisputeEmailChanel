package WCDM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ManageDispute {
	
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Trening\\QA Automation\\Chrome100\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tim-dev.zira:28090/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fillForm()
	{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("aa");		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("aa");
		driver.findElement(By.xpath("//input[@type=\"hidden\"]")).click();
		//String actual = driver.findElement(By.id("g2599-email")).getText();
		//Assert.assertEquals(actual, "damir.begic86@gmail.com");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}


}
