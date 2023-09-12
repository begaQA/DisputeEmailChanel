package WBRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DisputeAcquisition {
	
	WebDriver driver;
	@BeforeClass
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Trening\\QA Automation\\Chrome100\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tim-dev.zira:28080/billing/dispute/dispute-acquisition");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)	 
	public void FillForm() throws InterruptedException {
		/* driver.findElement(By.cssSelector(".submitlogin.text-center")).click(); */
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aa");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aa");
		driver.findElement(By.cssSelector(".submitlogin.text-center")).click();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		/*driver.findElement(By.xpath("//button[@class=\"submitlogin text-center\"]")).click(); */
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body > app-root > zx-page-layout-landscape > div > div.body > div.content > div.content-body > lib-dispute-acquisition > div > div > zx-tabs > div > div.header > ul > li:nth-child(3) > span")).click();
		driver.findElement(By.cssSelector("#DISPUTE_ACQUISITION_DEFINITION_CREATE_BTN > span")).click();
		driver.findElement(By.cssSelector("#Zx-d3fac-399-8bb9c > input")).sendKeys("10-1004531 - OpCo - 10993 SRL");
		driver.findElement(By.cssSelector("#DISPUTE_ACQUISITION_DEFINITION_SAVE_BTN > span")).click();
	}
	/*
	@Test(priority=2)
	public void DisputeAcquisition() {
		WebElement DisputeMgmnt = driver.findElement(By.className(".icon.fal.fa-tasks"));
		WebElement DisputeAcq = driver.findElement(By.xpath("//a[contains(@href, 'dispute/dispute-acquisition')]/child::span"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(DisputeMgmnt).moveToElement(DisputeAcq).click().build().perform();
		
	}
	*/
}
