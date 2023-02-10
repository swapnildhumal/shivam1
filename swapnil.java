package batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class swapnil {
	WebDriver driver;
	String url="https://rahulshettyacademy.com/locatorspractice";
	@BeforeTest
	public  void tc1() {	
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();   //launching the browser
	driver.get(url);             //Initiating data
	}
	@Test             //(enabled = false)
	public void tc2 () {
			
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void tc3( ) {
		driver.close();
	}


}
