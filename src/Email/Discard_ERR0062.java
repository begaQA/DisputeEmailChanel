package Email;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Discard_ERR0062 {
	
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Trening\\NEW\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("http://mailu.zira/webmail/");
	}
	
	@Test
	public void DiscardEmail() throws InterruptedException{
		driver.findElement(By.id("rcmloginuser")).sendKeys("mirso@zira.com");
		driver.findElement(By.id("rcmloginpwd")).sendKeys("vivaindira2016");
		driver.findElement(By.id("rcmloginsubmit")).click();
		Thread.sleep(2500l);
		driver.findElement(By.id("rcmbtn109")).click();
		Thread.sleep(2500l);
		driver.findElement(By.xpath("//textarea[@name='_to']")).sendKeys("vivarsm@zira.com");
		driver.findElement(By.xpath("//input[@id='compose-subject']")).sendKeys("Dispute Acquisition");
		driver.findElement(By.id("composebody")).sendKeys("Buongiorno,\r\n"
				+ "\r\n"
				+ "Con questa email vi apriamo la disputa:\r\n"
				+ "\r\n"
				+ "ID Fattura OAO: C12020191000050023\r\n"
				+ "Causale: Servizi disconosciuti/non consegnati\r\n"
				+ "Totale Disputato: 123.3\r\n"
				+ "Note OAO: Test note OAO comment");
		driver.findElement(By.linkText("Attach a file")).click();
		Thread.sleep(1000l);
	    StringSelection stringSelection = new StringSelection("C:\\Users\\User\\Desktop\\Zira\\Dispute\\Testing\\AutomationQA\\Email\\Discard\\ERR0062\\ATC_ERR0062.xlsx");
	    Clipboard clipboard = Toolkit
        		.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);	
        Thread.sleep(2000l);
		driver.findElement(By.linkText("Send")).click();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		/*actions.click(to).perform();
		WebElement DisputeAcqusition = driver.findElement(By.xpath(".//span[text()=' Dispute Acquisition ']"));
		actions.click(DisputeAcqusition).perform(); */
	}
	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}


}
