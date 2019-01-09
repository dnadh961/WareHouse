package com.cpwh.pages;

import org.openqa.selenium.By;

import com.cpwh.SUT;
import com.cpwh.pages.filters.PhoneFilters;

public class PhonesPage extends BasePage{
	
	private PhoneFilters filtersPage = null;

	public PhonesPage(SUT sut) {
		super(sut);
	}
	
	public PhoneFilters getFiltersPage(){
		if(filtersPage == null) {
			filtersPage = new PhoneFilters(sut);
		}
		return filtersPage;
	}
	
	public DevicePage selectFirst(){
		findElement(By.linkText("Select")).click();
		return new DevicePage(sut);
	}

}
