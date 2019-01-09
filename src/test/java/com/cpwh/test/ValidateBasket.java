package com.cpwh.test;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cpwh.Browser;
import com.cpwh.SUT;
import com.cpwh.pages.BasketPage;
import com.cpwh.pages.CheckoutPage;
import com.cpwh.pages.DealsPage;
import com.cpwh.pages.DevicePage;
import com.cpwh.pages.HomePage;
import com.cpwh.pages.HomePage.Menus;
import com.cpwh.pages.filters.DealsFilters;
import com.cpwh.pages.filters.DealsFilters.Networks;
import com.cpwh.pages.filters.PhoneFilters;
import com.cpwh.pages.filters.CommonFilters.Costs;
import com.cpwh.pages.filters.PhoneFilters.Brands;
import com.cpwh.pages.PhonesPage;
import com.cpwh.pages.BasketPage.MonthlyCap;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ValidateBasket {
	
	private Browser browser = null;
	private SUT sut = null;
	private HomePage homePage = null;
	private PhonesPage phonesPage = null;
	private PhoneFilters phoneFilters = null;
	private DealsPage dealsPage = null;
	private DevicePage devicePage = null;
	private DealsFilters dealsFilters = null;
	private BasketPage basketPage = null;
	private CheckoutPage checkoutPage = null;
	
	@Before("@TC-100")
	public void setUp(Scenario scenario){
		sut = new SUT();
	    browser = sut.getBrowser();
	}
	
	@Given("^User opens warehouse home page$")
	public void user_opens_warehouse_home_page() {
		homePage = browser.open();
		homePage.acceptAndClose();
	}
	
	@When("^user clicks on \"([^\"]*)\" menu$")
	public void user_clicks_on_menu(String menu) {
		homePage.clickMenu(Menus.valueOf(menu));
	}
	
	@When("^opens a phones page \"([^\"]*)\"$")
	public void opens_a_phones_page(String link) {
		 phonesPage = homePage.openPhonesPage(link);
	}

	@When("^selects a brand \"([^\"]*)\"$")
	public void selects_a_brand(String brand) {
		phoneFilters = phonesPage.getFiltersPage();
	    phoneFilters.selectBrand(Brands.valueOf(brand));
	}

	@When("^selects upfront cost \"([^\"]*)\"$")
	public void selects_upfront_cost(String cost) {
		phoneFilters.selectUpfrontCost(Costs.valueOf(cost));
	}
	
	@When("^selects monthly cost \"([^\"]*)\"$")
	public void selects_monthly_cost(String cost) {
		phoneFilters.selectMonthlyCost(Costs.valueOf(cost));
	}
	
	@When("^selects first phone in the search results$")
	public void selects_first_phone_in_search_results() {
		sut.handleWaits().sleep(5);
		devicePage = phonesPage.selectFirst();
	}
	
	@When("^clicks on View deals$")
	public void clicks_on_View_deals() {
	    dealsPage = devicePage.viewDeals();
	}

	@When("^selects Cheapest total cost from Filter Plans$")
	public void selects_Cheapest_total_cost_from_Filter_Plans() {
	    dealsFilters = dealsPage.getDealsFilters();
	    dealsFilters.cheapestTotalCost();
	}

	@When("^selects Network as \"([^\"]*)\"$")
	public void selects_Network_as(String network) {
		dealsFilters.selectNetwork(Networks.valueOf(network));
	}

	@When("^adds first plan to basket$")
	public void adds_first_plan_to_basket() {
	    dealsPage.addFirstDealToBasket();
	}

	@When("^adds first accessory to basket from Choose your Extras$")
	public void adds_first_accessory_to_basket_from_Choose_your_Extras() {
	    dealsPage.addFirstAccessoryToBasket();
	}

	@When("^clicks on Continue to bakset$")
	public void clicks_on_Continue_to_bakset() {
	    basketPage = dealsPage.continueToBasket();
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

	@When("^fills the details in About You section \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fills_the_details_in_About_You_section(String email, String title, String fName, String lName, String contact, String maritalStatus) {
	    checkoutPage.fillAboutYou(email, title, fName, lName, contact, maritalStatus);
	}

	@When("^sets pincode \"([^\"]*)\"$")
	public void sets_pincode(String pincode) {
	    checkoutPage.setPinCode(pincode);
	}

	@Given("^clicks on Continue to delivery$")
	public void clicks_on_Continue_to_delivery() {
	    checkoutPage.continueToDelivery();
	}
	
	@After("@TC-100")
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()){
			byte[] screenshot = ((TakesScreenshot) sut.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		/*browser.close();
		sut.kill();*/
	}

}
