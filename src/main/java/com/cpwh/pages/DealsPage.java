package com.cpwh.pages;

import org.openqa.selenium.By;

import com.cpwh.SUT;
import com.cpwh.pages.filters.DealsFilters;

public class DealsPage extends BasePage{

	public DealsPage(SUT sut) {
		super(sut);
	}
	
	public DealsFilters getDealsFilters() {
		return new DealsFilters(sut);
	}
	
	public void addFirstDealToBasket(){
		findElement(By.xpath("//div[contains(@class, 'side')]//button[contains(text(), 'Add to basket')]")).click();
	}
	
	public void addFirstAccessoryToBasket(){
		findElement(By.xpath("//div[@class='attachAccContainer']//span[contains(text(), 'Add to basket')]")).click();
	}
	
	public BasketPage continueToBasket() {
		findElement(By.id("addSlctdToBskt")).click();
		return new BasketPage(sut);
	}

}
