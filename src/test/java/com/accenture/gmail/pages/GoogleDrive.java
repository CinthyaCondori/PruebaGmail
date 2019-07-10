package com.accenture.gmail.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GoogleDrive extends PageObject{
	
	@FindBy(xpath = "/html/body/section/div[2]/div/a") private WebElementFacade btnIrGoogleDrive;
	
	
	public void SeleccionarGoogleDrive() {
		
		btnIrGoogleDrive.click();
	}

}
