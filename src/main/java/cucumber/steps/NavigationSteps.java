package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NavigationSteps {
	

@Given("I navigate to the 'GoodRx' website")
public void i_navigate_to_the_website(String string) {
    // Write code here that turns the phrase above into concrete actions
    CommonSteps.webDriver.navigate().to("http://goodRx.com");

}



@Then("I click on the {string} field")
public void i_click_on_the_field(String string) {
    // Write code here that turns the phrase above into concrete actions
	
}
@Then("I input data on {string}")
public void i_input_data_on(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I click on {string}")
public void i_click_on(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}




}
