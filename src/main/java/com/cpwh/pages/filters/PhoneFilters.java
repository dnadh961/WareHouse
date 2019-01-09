package com.cpwh.pages.filters;

import org.openqa.selenium.By;

import com.cpwh.SUT;

public class PhoneFilters extends CommonFilters{
	
	public enum Brands {
		Apple("Brand-Apple"), Samsung("Brand-Samsung"), Sony("Brand-Sony");
		
		private String brand;
		
		Brands(String brand) {
			this.brand = brand;
		}
		
		public String getValue(){
			return brand;
		}
	}

	public PhoneFilters(SUT sut) {
		super(sut);
	}
	
	public void selectBrand(Brands brand){
		findElement(By.xpath("//label[@for='"+brand.getValue()+"']")).click();
	}

}
