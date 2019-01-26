package com.cpwh.test;


import com.cpwh.SUT;
import com.cpwh.pages.BasketPage;
import com.cpwh.pages.BasketPage.MonthlyCap;
import com.cpwh.pages.CheckoutPage;
import com.google.inject.Inject;

import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class ValidateBasket {
	
	private SUT sut = null;
	private BasketPage basketPage = null;
	private CheckoutPage checkoutPage = null;

	/*@Before("@TC-100")
	public void setUp(Scenario scenario){
		sut = new SUT();
	    browser = sut.getBrowser();
	}*/
	
	@Inject
	public ValidateBasket(SUT sut) {
		this.sut = sut;
	}

	@When("^clicks on Go to checkout$")
	public void clicks_on_Go_to_checkout() {
	    basketPage.goToCheckout();
	}

	@When("^selects \"([^\"]*)\" monthly cap$")
	public void selects_monthly_cap(String cap) {
	    basketPage.selectMonthlyCap(MonthlyCap.valueOf(cap));
	}

	@When("^clicks on Continue to checkout$")
	public void clicks_on_Continue_to_checkout() {
	    checkoutPage = basketPage.continueToCheckout();
	}

	@When("^fills the details in About You section \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fills_the_details_in_About_You_section(String email, String title, String fName, String lName, String contact,
			String dob, String maritalStatus, String employmentStatus) {
	    checkoutPage.fillAboutYou(email, title, fName, lName, contact, dob, maritalStatus, employmentStatus);
	}

	@When("^sets pincode \"([^\"]*)\"$")
	public void sets_pincode(String pincode) {
	    checkoutPage.setPinCode(pincode);
	}

	@When("^clicks on Continue to delivery$")
	public void clicks_on_Continue_to_delivery() {
	    checkoutPage.continueToDelivery();
	}
	
	/*@After("@TC-100")
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()){
			byte[] screenshot = ((TakesScreenshot) sut.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		browser.close();
		sut.kill();
	}*/

}
