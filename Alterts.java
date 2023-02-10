package batch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alterts {
	WebDriver driver;
	String url="https://www.bput.ac.in/";
	String url1="https://www.google.com";
	String url2="https://demoqa.com/alerts";
	@BeforeTest
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get(url2);
	}
		@Test
		public void tc2() {
			driver.findElement(By.id("promtButton")).click();
			Alert action= driver.switchTo().alert();
			action.sendKeys("swapnil");
			action.accept();
			System.out.println(action);
				
		}
		@Test
		public void tc3() {
			driver.findElement(By.id("confirmButton")).click();
			Alert action=driver.switchTo().alert();
			action.accept();
			System.out.println(action);
		}
		@Test
		public void tc4() {
			driver.findElement(By.id("timerAlertButton")).click();
			Alert action=driver.switchTo().alert();
			action.accept();
			System.out.println(action);
			
		}
			
		

}
