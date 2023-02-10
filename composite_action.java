package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class composite_action {
	WebDriver driver;
	String url="https://www.amazon.in/";
	String url1="https://www.google.com/";
	String url2="https://demoqa.com/alerts";
	@BeforeTest
	public void tc()  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get(url);
	
	}
	@Test
	public void tc1() {
		WebElement we=driver.findElement(By.id("twotabsearchtextbox"));
		Actions action=new Actions(driver);
		action.moveToElement(we).click().keyDown(Keys.SHIFT).sendKeys("sparks").doubleClick().build().perform();
	}
}
