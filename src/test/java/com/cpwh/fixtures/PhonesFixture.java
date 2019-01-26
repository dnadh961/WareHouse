package com.cpwh.fixtures;

import com.cpwh.SUT;
import com.cpwh.pages.DevicePage;
import com.cpwh.pages.PhonesPage;
import com.cpwh.pages.filters.PhoneFilters;
import com.cpwh.pages.filters.CommonFilters.Costs;
import com.cpwh.pages.filters.PhoneFilters.Brands;
import com.google.inject.Inject;

import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class PhonesFixture extends PhonesPage{
	
	private SUT sut;
	private PhonesPage phonesPage;
	private PhoneFilters phoneFilters;
	private DevicePage devicePage;
	
	@Inject
	public PhonesFixture(SUT sut, HomeFixture homeFixture) {
		super(sut);
		this.sut = sut;
		phonesPage = homeFixture.getPhonesPage();
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
		setDevicePage(phonesPage.selectFirst());
	}

	public DevicePage getDevicePage() {
		return devicePage;
	}

	public void setDevicePage(DevicePage devicePage) {
		this.devicePage = devicePage;
	}

}
