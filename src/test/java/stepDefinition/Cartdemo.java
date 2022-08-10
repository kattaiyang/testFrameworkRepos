package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cartdemo {
	@Given("user  launches the application")
	public void user_launches_the_application() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for launch application");
	}

	@Then("enters the valid username")
	public void enters_the_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for valid username");
	}

	@Then("valida password")
	public void valida_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for valid password");
	}

	@When("clicks on submit user login is success")
	public void clicks_on_submit_user_login_is_success() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for login success");
	}

	@Given("user search resulted in a valid prodcut test")
	public void user_search_resulted_in_a_valid_prodcut() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for search item");
	}

	@Then("user clicks on button to add the item to cart test")
	public void user_clicks_on_button_to_add_the_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for click on add symbol");
	}

	@Given("user has atleast one item in the cart")
	public void user_has_atleast_one_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for item check in cart");
	}

	@Then("user clicks minus symbol next to cart")
	public void user_clicks_minus_symbol_next_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for click on minus symbol");
	}

}
