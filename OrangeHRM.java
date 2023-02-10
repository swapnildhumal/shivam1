package batch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeTest
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void tc2() throws InterruptedException, AWTException {
		WebElement enter=driver.findElement(By.xpath("//input[@name='username']"));
		Actions action=new Actions(driver);
		action.moveToElement(enter).build().perform();
		action.click(enter).build().perform();
		Thread.sleep(5000);
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_SHIFT);
		rc.keyPress(KeyEvent.VK_A);
		rc.keyRelease(KeyEvent.VK_SHIFT);
		rc.keyPress(KeyEvent.VK_D);
		rc.keyPress(KeyEvent.VK_M);
		rc.keyPress(KeyEvent.VK_I);
		rc.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(5000);
			
	}
	@Test
	public void tc3() throws InterruptedException, AWTException {
		WebElement enter=driver.findElement(By.xpath("//input[@name='password']"));
		Actions action=new Actions(driver);
		action.moveToElement(enter).build().perform();
		action.click(enter).build().perform();
		Thread.sleep(5000);
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_A);
		rc.keyPress(KeyEvent.VK_D);
		rc.keyPress(KeyEvent.VK_M);
		rc.keyPress(KeyEvent.VK_I);
		rc.keyPress(KeyEvent.VK_N);	
		rc.keyPress(KeyEvent.VK_1);
		rc.keyPress(KeyEvent.VK_2);
		rc.keyPress(KeyEvent.VK_3);
		rc.keyPress(MenuKeyEvent.VK_ENTER);
	}
	

}
