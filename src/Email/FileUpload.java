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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public void uploadFile(String path) {
	
	 StringSelection stringSelection = new StringSelection(path);
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
    // Thread.sleep(2000l);
		//WebElement element =driver.findElement(By.linkText("Send")).click();
		/*actions.click(to).perform();
		WebElement DisputeAcqusition = driver.findElement(By.xpath(".//span[text()=' Dispute Acquisition ']"));
		actions.click(DisputeAcqusition).perform(); */
		
	}

}
