package com.cpwh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cpwh.SUT;

public class BasketPage extends BasePage{
	
	public enum MonthlyCap {
		GBP_10("BC010"), GBP_20("BC020"), GBP_40("BC040"), GBP_50("BC050"), NO_BILL_CAP("BCOFF");
		
		private String cost;
		
		MonthlyCap(String cost) {
			this.cost = cost;
		}
		
		public String getValue(){
			return cost;
		}
	}

	public BasketPage(SUT sut) {
		super(sut);
	}
	
	public void goToCheckout() {
		findElement(By.id("billCappingbtnTop")).click();
	}
	
	//return item info for given index. 1 for first item/ 2 for second
	public ItemInfo getItem(int index) {
		return new ItemInfo();
	}
	
	public void selectMonthlyCap(MonthlyCap cap) {
		WebElement elmt = findElement(By.id("customerTitle"));
		Select monthlyCapSlct = new Select(elmt);
		monthlyCapSlct.selectByValue(cap.getValue());
	}
	
	public CheckoutPage continueToCheckout() {
		findElement(By.xpath("//button[contains(text(), 'Continue to checkout')]")).click();
		return new CheckoutPage(sut);
	}

}
