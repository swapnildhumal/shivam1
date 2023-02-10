package batch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptExe {
	WebDriver driver;
	String url="https://www.rahulshettyacademy.com/practice-project";
	
	@BeforeTest
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test
	public void tc2() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('name').value=\'swapnil'" );
		js.executeScript("document.getElementById('email').value=\'swapnil93@gmail.com\'");
		js.executeScript("document.getElementById('agreeTerms').click()");
		js.executeScript("document.getElementById('form-submit').click()");
	
	}

}
