package banking.test;

import main.java.Posting;
import main.java.QuickPostBLL;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	
	Posting posting = new Posting ();
	
	@Given("^emplyee enter all valid data$")
	public void emplyee_enter_all_valid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		posting.setDestination("Madhapur");
		posting.setEmail("naveenhome@gmail.com");
		posting.setName("Naveen");
		posting.setOrigin("Miyapur");
		posting.setPhone("9810547500");
		posting.setTime("5.30pm");
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String actionButton) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^system display message \"([^\"]*)\"$")
	public void system_display_message(String expectedMessage) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		QuickPostBLL quickPost = new QuickPostBLL();
		String result=quickPost.Validate(posting);
		assertEquals(expectedMessage, result);
	}

	@Then("^Search page get reloaded with current posting on top$")
	public void Search_page_get_reloaded_with_current_posting_on_top() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^\"([^\"]*)\" has already posted his vehicle$")
	public void has_already_posted_his_vehicle(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^\"([^\"]*)\" wanted to post again$")
	public void wanted_to_post_again(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Given("^emplyee enter all Invalid data$")
	public void emplyee_enter_all_Invalid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
