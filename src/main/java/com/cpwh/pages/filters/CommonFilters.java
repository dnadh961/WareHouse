package com.cpwh.pages.filters;

import org.openqa.selenium.By;

import com.cpwh.SUT;
import com.cpwh.pages.BasePage;

public class CommonFilters extends BasePage{
	
	public enum Costs {
		GBP_10("10"), GBP_20("20"), GBP_50("50"), GBP_100("100");
		
		private String cost;
		
		Costs(String cost) {
			this.cost = cost;
		}
		
		public String getValue(){
			return cost;
		}
	}

	public CommonFilters(SUT sut) {
		super(sut);
	}
	
	public void selectUpfrontCost(Costs cost){
		findElement(By.xpath("//div[contains(@class, 'itemised-facet')][.//span[text()='Upfront cost']]"
				+ "//label[contains(text(), '"+cost.getValue()+"')]")).click();
	}
	
	public void selectMonthlyCost(Costs cost){
		findElement(By.xpath("//div[contains(@class, 'itemised-facet')][.//span[text()='Monthly cost']]"
				+ "//label[contains(text(), '"+cost.getValue()+"')]")).click();
	}

}
