package com.cpwh.fixtures;

import com.cpwh.Browser;
import com.cpwh.SUT;
import com.cpwh.pages.HomePage;
import com.google.inject.Inject;

import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class BrowserFixture extends Browser{
	
	private HomePage homePage;
	
	public HomePage getHomePage() {
		return homePage;
	}

	@Inject
	public BrowserFixture(SUT sut) {
		super(sut);
	}

	@Given("^User opens warehouse home page$")
	public void user_opens_warehouse_home_page() {
		homePage = open();
		homePage.acceptAndClose();
	}
}
