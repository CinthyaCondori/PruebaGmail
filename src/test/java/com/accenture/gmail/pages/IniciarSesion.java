package com.accenture.gmail.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IniciarSesion extends PageObject {
	
	@FindBy(xpath = "//*[@id=\"identifierId\"]") private WebElementFacade txtEmail;
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/span/span") private WebElementFacade btnSiguiente;
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input") private WebElementFacade txtContrase�a;
	@FindBy(xpath = "//*[@id=\"passwordNext\"]/span/span") private WebElementFacade btnSiguientePass;
	
	public void IngresarSesion(String email, String contrase�a) throws InterruptedException {
		
		txtEmail.waitUntilVisible().click();		
		txtEmail.waitUntilVisible().sendKeys(email);
		btnSiguiente.click();
		txtContrase�a.click();
		txtContrase�a.waitUntilVisible().sendKeys(contrase�a);
		btnSiguientePass.click();
		Thread.sleep(9000);
	}

}
