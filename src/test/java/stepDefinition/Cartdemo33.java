package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Cartdemo33 {
	@Given("user search resulted in a valid prodcut")
	public void user_search_resulted_in_a_valid_prodcut() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for search item by srini");
		
	}

	@Then("user clicks on button to add the item to cart")
	public void user_clicks_on_button_to_add_the_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		Assert.assertEquals(2, 1);
		System.out.println("code for click on add symbol by srini");
}
}