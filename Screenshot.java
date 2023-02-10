package batch;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
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
	public void tc2() throws IOException {
		File swapnil=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(swapnil, new File("C:/Users/Akshay/OneDrive/Desktop/seleniumScreenshot/sh.png"));
	}

}
