package demoJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoClass {
	private static WebDriver driver;
	
	public static void main(String a[]) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\InternetExplorer\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
}
