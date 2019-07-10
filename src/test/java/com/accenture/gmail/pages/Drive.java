package com.accenture.gmail.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Drive extends PageObject{
	
	@FindBy(xpath = "//*[@id=\"drive_main_page\"]/div[2]/div[1]/div[1]/div/div/div[3]/div[1]/div/button[1]/div[2]") private WebElementFacade btnNuevo;
	
	public void CrearDocumento(String documento) {
		
		btnNuevo.click();
		btnNuevo.waitUntilVisible().sendKeys(documento);		

	}
}
