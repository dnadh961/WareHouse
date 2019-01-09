package com.cpwh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.cpwh.SUT;

public class CheckoutPage extends BasePage{

	public CheckoutPage(SUT sut) {
		super(sut);
	}
	
	public void fillAboutYou(String email, String title, String fName, String lName, String contact, String maritalStatus){
		findElement(By.id("email")).sendKeys(email);
		Select titleSlct = new Select(findElement(By.id("customerTitle")));
		titleSlct.selectByVisibleText(title);
		findElement(By.id("firstName")).sendKeys(fName);
		findElement(By.id("lastName")).sendKeys(lName);
		findElement(By.id("homeNumber")).sendKeys(contact);
		Select maritalSlct = new Select(findElement(By.id("martialStatus")));
		maritalSlct.selectByVisibleText(maritalStatus);
	}
	
	public void setPinCode(String pincode) {
		findElement(By.id("postcode")).sendKeys(pincode);
	}
	
	public void continueToDelivery() {
		findElement(By.id("goToDelivery")).click();
	}

}
