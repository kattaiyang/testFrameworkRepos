package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Documents\\Selenium Drivers\\BrowserDrivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("");

	}

}
