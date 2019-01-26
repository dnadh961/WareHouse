package com.cpwh.fixtures;

import com.cpwh.SUT;
import com.cpwh.pages.HomePage;
import com.cpwh.pages.PhonesPage;
import com.google.inject.Inject;

import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class HomeFixture extends HomePage{
	
	//private SUT sut;
	private HomePage homePage;
	private PhonesPage phonesPage;

	@Inject
	public HomeFixture(SUT sut, BrowserFixture browserFixture) {
		super(sut);
		homePage = browserFixture.getHomePage();
	}
	
	@When("^user clicks on \"([^\"]*)\" menu$")
	public void user_clicks_on_menu(String menu) {
		homePage.clickMenu(Menus.valueOf(menu));
	}
	
	@When("^opens a phones page \"([^\"]*)\"$")
	public void opens_a_phones_page(String link) {
		 phonesPage = homePage.openPhonesPage(link);
	}

	public PhonesPage getPhonesPage() {
		return phonesPage;
	}
}
