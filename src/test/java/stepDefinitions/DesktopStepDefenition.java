package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;

public class DesktopStepDefenition extends Base {
	
	DesktopPageObj desktop = new DesktopPageObj();
	

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
	    desktop.clickOnDesktops();
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
	    desktop.clickShowAllDesktops();
	}

	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
	    desktop.clickOnCanonEOS5D();
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
	    desktop.clickOnWriteAReview();
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable WriteReview) throws Throwable {
		
		List<Map<String, String>> data = WriteReview.asMaps(String.class, String.class);
		
		desktop.writeYourName(data.get(0).get("yourname"));
		desktop.writeyourreview(data.get(0).get("yourReview"));
		desktop.clickonGoodRating();
	    
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
	    desktop.clickOnContinueButton();
	}

	@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval\\.”$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() throws Throwable {
	    WebDriverUtility.screenShot();
	}
	

}
