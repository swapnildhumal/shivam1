package batch;

import java.awt.AWTException;
import java.awt.Menu;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swapnil2 {
	WebDriver driver;
	//String url="https://www.bput.ac.in";
	String url1="https://www.google.com";
	String url2="https://demoqa.com/alerts";
	@BeforeTest
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();   
		//driver.get(url);
		driver.get(url2);
	}
	//@Test
	public void tc2() {
		System.out.println(driver.getTitle());
	}
	//@Test
	public void tc3() {
		WebElement click=driver.findElement(By.linkText("About Us"));
		Actions action=new Actions(driver);
		action.moveToElement(click).build().perform();
		
	}
	//@Test
	public void tc4() throws InterruptedException, AWTException {
		WebElement click=driver.findElement(By.linkText("Gmail"));
		Actions action=new Actions(driver);
		action.moveToElement(click).build().perform();
		action.contextClick().build().perform();
		Thread.sleep(5000);
		//action.sendKeys(Keys.DOWN).build().perform();   //for scrolling 
		Robot rc=new Robot();
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_ENTER);
		Thread.sleep(5000);
		rc.keyPress(MenuKeyEvent.VK_CONTROL);
		rc.keyPress(MenuKeyEvent.VK_TAB);
		System.out.println(driver.getTitle());
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> tabs=driver.getWindowHandles();
		System.out.println(tabs);
		for(String handles:tabs) {
			driver.switchTo().window(handles);
			System.out.println(driver.getTitle());
		}
		driver.switchTo().window(parent);
		driver.get("https://www.bput.ac.in");
		
			
	}
	@Test
	public void tc5() {
		driver.findElement(By.id("alertButton")).click();
		Alert act=driver.switchTo().alert();
		String msg=act.getText();
		System.out.println(msg);
		act.accept();
	}
}	
	
	
	


