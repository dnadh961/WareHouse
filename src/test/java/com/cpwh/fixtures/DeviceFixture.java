package com.cpwh.fixtures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cpwh.SUT;
import com.cpwh.pages.BasketPage;
import com.cpwh.pages.DealsPage;
import com.cpwh.pages.DevicePage;
import com.cpwh.pages.filters.DealsFilters;
import com.cpwh.pages.filters.DealsFilters.Networks;
import com.google.inject.Inject;

import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class DeviceFixture extends DevicePage{
	
	private DevicePage devicePage;
	private DealsPage dealsPage;
	private DealsFilters dealsFilters;
	private BasketPage basketPage;
	
	private Logger logger = LoggerFactory.getLogger(DeviceFixture.class);

	@Inject
	public DeviceFixture(SUT sut, PhonesFixture phonesFixture) {
		super(sut);
		devicePage = phonesFixture.getDevicePage();
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
		sut.handleWaits().sleep(5);
		dealsFilters.selectNetwork(Networks.valueOf(network));
	}

	@When("^adds first plan to basket$")
	public void adds_first_plan_to_basket() {
	    dealsPage.addFirstDealToBasket();
	}

	@When("^adds first accessory to basket from Choose your Extras$")
	public void adds_first_accessory_to_basket_from_Choose_your_Extras() {
		try{
			dealsPage.addFirstAccessoryToBasket();
		} catch(Exception e) {
			logger.warn("Additional accessories are not there for current device");
		}
	}

	@When("^clicks on Continue to bakset$")
	public void clicks_on_Continue_to_bakset() {
	    setBasketPage(dealsPage.continueToBasket());
	}

	public BasketPage getBasketPage() {
		return basketPage;
	}

	public void setBasketPage(BasketPage basketPage) {
		this.basketPage = basketPage;
	}

}
