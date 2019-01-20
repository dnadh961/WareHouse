package com.cpwh.pages;

import org.openqa.selenium.By;

import com.cpwh.SUT;

public class HomePage extends BasePage{
	
	private String ACCEPT_CLOSE_XPATH = "//button[contains(text(), 'Accept and close')]";
	
	public enum Menus {
		
		Shop("Shop"), Discover("Discover"), Help("Help");
		
		private String menu;
		
		Menus(String menu) {
			this.menu = menu;
		}
		
		public String getValue(){
			return menu;
		}
	}

	public HomePage(SUT sut) {
		super(sut);
		sut.handleWaits().sleep(3);
		try{
			driver.switchTo().frame("edr_l_first");
			driver.findElement(By.cssSelector("img[title='Close']")).click();
			driver.switchTo().defaultContent();
		} catch(Exception e){
			//ignore exception
		}
	}
	
	public void clickMenu(Menus menu){
		findElement(By.partialLinkText(menu.getValue())).click();
	}
	
	public PhonesPage openPhonesPage(String link){
		PhonesPage phonesPage = null;
		findElement(By.linkText(link)).click();
		//else statements to handle remaining phones pages
		if(link.contains("All pay monthly phones")){
			phonesPage = new PayMonthly(sut);
		} else if(link.contains("All pay as you go")) {
			phonesPage = new PayAsYouGo(sut);
		}
		return phonesPage;
	}
	
	public void acceptAndClose(){
		findElement(By.xpath(ACCEPT_CLOSE_XPATH)).click();
	}

}
