package Email;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DisputeAcq_WITHOUT_atc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Trening\\NEW\\chromedriver.exe");
		//SeleniumBrowser browser = new SeleniumBrowser();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("http://mailu.zira/webmail/");
		driver.findElement(By.id("rcmloginuser")).sendKeys("mirso@zira.com");
		driver.findElement(By.id("rcmloginpwd")).sendKeys("vivaindira2016");
		driver.findElement(By.id("rcmloginsubmit")).click();
		Thread.sleep(2000l);
		WebElement compose = driver.findElement(By.id("rcmbtn109"));
		actions.click(compose).perform();
		driver.findElement(By.id("_to")).sendKeys("vivarsm@zira.com");
		driver.findElement(By.xpath("//input[@id='compose-subject']")).sendKeys("Dispute Acquisition");
		driver.findElement(By.id("composebody")).sendKeys("Buongiorno,\r\n"
				+ "\r\n"
				+ "Con questa email vi apriamo la disputa:\r\n"
				+ "\r\n"
				+ "ID Fattura OAO: C12020191000050023\r\n"
				+ "Causale: Servizi disconosciuti/non consegnati\r\n"
				+ "Totale Disputato: 123.3\r\n"
				+ "Note OAO: Test note OAO comment");
		driver.findElement(By.linkText("Send")).click();
		/*actions.click(to).perform();
		WebElement DisputeAcqusition = driver.findElement(By.xpath(".//span[text()=' Dispute Acquisition ']"));
		actions.click(DisputeAcqusition).perform(); */
	}

}
