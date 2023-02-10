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
import net.bytebuddy.implementation.bytecode.Division;

public class Normal_dropdown {
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
	//@Test
	public void tc2() {
		
			WebElement web= driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
			Select dropdown=new Select(web);
			//dropdown.selectByVisibleText("AED");
			//dropdown.selectByIndex(3);
			dropdown.selectByValue("AED");
	}
	//@Test
	public void tc3() throws InterruptedException {
		WebElement web=driver.findElement(By.id("divpaxinfo"));
		web.click();
		Thread.sleep(5000);
		driver.findElement(By.id("hrefIncAdt")).click();
		
	}
	@Test
	public void dynamicdropdown() throws InterruptedException {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.className("ui-datepicker-trigger")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]")).click();
	}

}
