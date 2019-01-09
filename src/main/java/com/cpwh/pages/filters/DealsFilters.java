package com.cpwh.pages.filters;

import org.openqa.selenium.By;

import com.cpwh.SUT;

public class DealsFilters extends CommonFilters{
	
	public enum Networks {
		EE("Network-EE"), ID("Network-iD"), O2("Network-O2"), VODAFONE("Network-Vodafone");
		
		private String network;
		
		Networks(String network) {
			this.network = network;
		}
		
		public String getValue(){
			return network;
		}
	}

	public DealsFilters(SUT sut) {
		super(sut);
	}
	
	public void lowestUpfrontCost() {
		findElement(By.xpath("//label[text()='Lowest upfront cost']")).click();
	}
	
	public void cheapestTotalCost() {
		findElement(By.xpath("//label[text()='Cheapest total cost']")).click();
	}
	
	public void selectNetwork(Networks network){
		findElement(By.xpath("//label[@for='"+network.getValue()+"']")).click();
	}

}
