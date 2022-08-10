package demoSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit
//	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium Drivers\\BrowserDrivers\\Chrome\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	driver.findElement(By.linkText("SignIn")).click();
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit
//	WebElement us=  driver.findElement(By.name("userName"));
//	us.sendKeys("Srinivas");
	
	driver.findElement(By.name("userName")).sendKeys("TestQAHYD1");
	driver.findElement(By.id("password")).sendKeys("Password123");
	driver.findElement(By.name("Login")).click();
	
	 
  }
  

}