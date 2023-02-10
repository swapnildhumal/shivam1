package batch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	WebDriver driver;
	String url="https://rahulshettyacademy.com/dropdownsPractise/";
	
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
		WebElement web= driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select dropdown=new Select(web);
		//dropdown.selectByVisibleText("AED");
		//dropdown.selectByIndex(3);
		dropdown.selectByValue("AED");
		
	}

}
