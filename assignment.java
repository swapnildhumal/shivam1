package batch;

import java.awt.AWTException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment {
	WebDriver driver;
	String url="https://www.amazon.in";
	String url1="https://www.hotstar.com/in";
	String url2="https://www.flipkart.com";
	@BeforeTest
	public void tc1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();   
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
	}
	@Test
	public void tc2() throws InterruptedException, AWTException {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		WebElement we=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button"));
		we.click();
		WebElement ab=driver.findElement(By.id("tabButton"));
		ab.click();
		Thread.sleep(5000);
		ArrayList<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		driver.get(url1);
		Thread.sleep(5000);
		ArrayList<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
		WebElement abc=driver.findElement(By.id("tabButton"));
		abc.click();
		Thread.sleep(5000);
		ArrayList<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		driver.get(url2);
		Thread.sleep(5000);
		ArrayList<String>tab3=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab3.get(0));
	
	
		    
		}
	
}
