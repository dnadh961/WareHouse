package com.cpwh;

import org.openqa.selenium.WebDriver;

import com.cpwh.pages.HomePage;

public class Browser{
	
	private SUT sut;
	private WebDriver driver = null;
	private Configuration config = null;
	
	public Browser(SUT sut) {
		this.sut = sut;
		driver = sut.getDriver();
		config = sut.getConfiguration();
	}

	public void close() {
		driver.close();
	}

	public HomePage open() {	
		driver.get(config.getURL());
		return new HomePage(sut);
	}
	
}






