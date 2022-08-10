package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelOrderBDD {
	WebDriver driver;
	@Given("the user has logged in successfully")
	public void the_user_has_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Documents\\Selenium Drivers\\BrowserDrivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
		driver.findElement(By.name("userName")).sendKeys("TestQAHYD1");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
		
	}

	@Then("user verifies for the active order")
	public void user_verifies_for_the_active_order() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for checking active order");
	}

	@When("User clicks cancel order")
	public void user_clicks_cancel_order() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for cancel order");
	}

	@When("user logout from the application")
	public void user_logout_from_the_application() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for logout");
	}

}
