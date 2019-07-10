package com.accenture.gmail.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")

	public class Inicio extends PageObject {
	
	@FindBy(xpath = "//*[@id=\"gbwa\"]/div/a") private WebElementFacade btnApps;
	@FindBy(id = "gb49") private WebElementFacade btnDrive;
	//gb49 id 
	public void InicioGmail() {
		
		btnApps.waitUntilVisible().click();
		btnDrive.click();
	}

}
