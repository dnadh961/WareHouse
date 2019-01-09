package com.cpwh.pages;

import org.openqa.selenium.By;

import com.cpwh.SUT;

public class DevicePage extends BasePage{

	public DevicePage(SUT sut) {
		super(sut);
	}
	
	public DealsPage viewDeals(){
		findElement(By.xpath("//button[text()='View deals']")).click();
		return new DealsPage(sut);
	}

}
