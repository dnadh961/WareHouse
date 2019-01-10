package com.cpwh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.cpwh.SUT;

public class CheckoutPage extends BasePage{

	public CheckoutPage(SUT sut) {
		super(sut);
	}
	
	public void fillAboutYou(String email, String title, String fName, String lName, String contact,
			String dob, String maritalStatus, String employmentStatus){
		findElement(By.id("email")).sendKeys(email);
		Select titleSlct = new Select(findElement(By.id("customerTitle")));
		titleSlct.selectByVisibleText(title);
		findElement(By.id("firstName")).sendKeys(fName);
		findElement(By.id("lastName")).sendKeys(lName);
		findElement(By.id("homeNumber")).sendKeys(contact);
		String[] parts = dob.split("-");
		Select daySlct = new Select(findElement(By.id("dobDay")));
		daySlct.selectByVisibleText(parts[0]);
		Select monthSlct = new Select(findElement(By.id("dobMonth")));
		monthSlct.selectByVisibleText(parts[1]);
		Select yearSlct = new Select(findElement(By.id("dobYear")));
		yearSlct.selectByVisibleText(parts[2]);
		Select maritalSlct = new Select(findElement(By.id("martialStatus")));
		maritalSlct.selectByVisibleText(maritalStatus);
		Select empStatusSlct = new Select(findElement(By.id("employmentStatus")));
		empStatusSlct.selectByVisibleText(employmentStatus);
	}
	
	public void setPinCode(String pincode) {
		findElement(By.id("postcode")).sendKeys(pincode);
	}
	
	public void continueToDelivery() {
		findElement(By.id("goToDelivery")).click();
	}

}
